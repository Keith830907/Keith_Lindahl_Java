using System;
using System.Collections.Generic;
//using System.ComponentModel;
using System.Data;
//using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
//using System.Text;
using System.Text.RegularExpressions;
//using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Linq;

namespace Week5Team1
{
    public partial class Form1 : Form
    {
        string filePath = string.Empty;
        DataTable stepsTable = new DataTable("StepsTable");
        List<string> stepsList = new List<string>();
        List<string> durationList = new List<string>();
        List<string> distanceList = new List<string>();
        XDocument xd;

        public Form1()
        {
            InitializeComponent();
            CreateTable();
            toolStripStatusLabel1.Text = "No File Open";
        }

        private void openToolStripMenuItem_Click(object sender, EventArgs e)
        {

            using (OpenFileDialog openFileDialog = new OpenFileDialog())
            {
                openFileDialog.InitialDirectory = Application.StartupPath;
                openFileDialog.Filter = "XML Files (*.xml)|*.xml|All files (*.*)|*.*";
                openFileDialog.FilterIndex = 1;
                openFileDialog.RestoreDirectory = true;

                if (openFileDialog.ShowDialog() == DialogResult.OK)
                {
                    ClearTable();
                    filePath = openFileDialog.FileName;
                    XDocument xDoc = XDocument.Load(filePath);
                    xd = xDoc;
                    toolStripStatusLabel1.Text = filePath;
                    startAddressQuery(xDoc);
                    endAddressQuery(xDoc);
                    totalDistanceQuery(xDoc);
                    totalTimeQuery(xDoc);
                    ReadSteps(xDoc);
                    CreateStepsTable();
                }
            }
        }

        private void GetAddressQuery()
        {
            string origin = textBox1.Text.Replace(' ', '+');
            string destin = textBox6.Text.Replace(' ', '+');
            string url = @"https://maps.googleapis.com/maps/api/directions/xml?origin=" + origin + "&destination=" + destin + "&key=AIzaSyCjJPsjSdaDd7zuv4skNmHEsHaCJ1wvyPs ";
            string url1 = @"https://maps.googleapis.com/maps/api/mapsembed/xml?origin=" + origin + "&destination=" + destin + "&key=AIzaSyCjJPsjSdaDd7zuv4skNmHEsHaCJ1wvyPs ";
            WebRequest request = WebRequest.Create(url);
            WebResponse response = request.GetResponse();
            XDocument xdoc;
            using (Stream data = response.GetResponseStream())
            {
                xdoc = XDocument.Load(data);
            }
            xd = xdoc;
            ClearTable();
            startAddressQuery(xdoc);
            endAddressQuery(xdoc);
            totalDistanceQuery(xdoc);
            totalTimeQuery(xdoc);
            ReadSteps(xdoc);
            CreateStepsTable();
            response.Close();

        }

        private void startAddressQuery(XDocument xDoc)
        {

            XElement route = xDoc.Root.Element("route").Element("leg").Element("start_address");
            textBox1.Text = route.Value;
        }

        private void endAddressQuery(XDocument xDoc)
        {
            XElement route = xDoc.Root.Descendants("end_address").Last();
            textBox6.Text = route.Value;

        }

        private void totalDistanceQuery(XDocument xDoc)
        {
            List<string> totalDistanceList = new List<string>();
            int i = 0;
            int totalDistance = 0;
            IEnumerable<XElement> distances =
                from el in xDoc.Root.Elements("route").Elements("leg").Elements("distance").Elements("value")
                select el;
            foreach (XElement distance in distances)
            {
                totalDistanceList.Add(distance.Value);
            }
            foreach (string dist in totalDistanceList)
            {
                totalDistance += Int32.Parse(totalDistanceList[i]) / 1609;
                i++;
            }
            textBox2.Text = totalDistance.ToString() + " mi";
        }

        private void totalTimeQuery(XDocument xDoc)
        {
            List<string> totalDurationList = new List<string>();
            int i = 0;
            int j = 0;
            int totalDuration = 0;
            IEnumerable<XElement> durations =
                from el in xDoc.Root.Elements("route").Elements("leg").Elements("duration").Elements("value")
                select el;
            foreach (XElement duration in durations)
            {
                totalDurationList.Add(duration.Value);
                i++;
            }
            foreach (string dist in totalDurationList)
            {
                totalDuration += Int32.Parse(totalDurationList[j]);
                j++;
            }

            int totalDurationHours = totalDuration / 60 / 60;
            int totalDurationMinutes = (totalDuration / 60) - (totalDurationHours * 60);
            textBox3.Text = totalDurationHours.ToString() + " Hrs, " + totalDurationMinutes.ToString() + " Mins";
        }

        private void ReadSteps(XDocument xDoc)
        {
            IEnumerable<XElement> directions =
                from el in xDoc.Root.Elements("route").Elements("leg").Elements("step").Elements("html_instructions")
                select el;
            foreach (XElement direction in directions)
            {
                string dir = Regex.Replace(direction.Value, @"<[^>]*>", String.Empty);

                stepsList.Add(dir);
                //MessageBox.Show(direction.Value);
            }

            IEnumerable<XElement> durations =
                from el in xDoc.Root.Elements("route").Elements("leg").Elements("step").Elements("duration").Elements("value")
                select el;

            foreach (XElement duration in durations)
            {
                durationList.Add(duration.Value);
                //MessageBox.Show(duration.Value);
            }

            IEnumerable<XElement> distances =
                from el in xDoc.Root.Elements("route").Elements("leg").Elements("step").Elements("distance").Elements("value")
                select el;

            foreach (XElement distance in distances)
            {
                distanceList.Add(distance.Value);
            }
        }

        private void CreateTable()
        {
            DataColumn column;

            column = new DataColumn("Step #");
            stepsTable.Columns.Add(column);

            column = new DataColumn("Direction");
            stepsTable.Columns.Add(column);

            column = new DataColumn("Distance");
            stepsTable.Columns.Add(column);

            column = new DataColumn("Time");
            stepsTable.Columns.Add(column);

        }

        private void CreateStepsTable()
        {
            DataRow row;

            var stepAndDistance = stepsList.Zip(distanceList, (st, di) => new { step = st, distance = di });
            var stepParts = stepAndDistance.Zip(durationList, (sd, du) => new { stepAndDistance = sd, duration = du });
            int i = 1;
            foreach (var step in stepParts)
            {
                string distance = Math.Round((Double.Parse(step.stepAndDistance.distance) / 1609), 2).ToString();
                double duration = Double.Parse(step.duration) / 60;
                double min = 0;
                double hr = 0;
                string time = "";

                if (duration > 60)
                {
                    hr = Math.Floor(duration / 60);
                    min = Math.Ceiling(duration - (hr * 60));
                    time = hr.ToString() + " hrs, " + min.ToString() + " mins";

                }
                else
                {
                    time = Math.Ceiling(duration).ToString() + " mins";
                }

                row = stepsTable.NewRow();
                row["Step #"] = i;
                row["Direction"] = step.stepAndDistance.step;
                row["Distance"] = distance + " mi";
                row["Time"] = time;
                stepsTable.Rows.Add(row);
                i++;
            }

            dataGridView1.DataSource = stepsTable;

        }

        private void ClearTable()
        {
            dataGridView1.DataSource = null;
            dataGridView1.Refresh();
            stepsTable.Clear();
            stepsList.Clear();
            durationList.Clear();
            distanceList.Clear();
            textBox2.Text = null;
            textBox3.Text = null;
            textBox1.Text = null;
            textBox6.Text = null;
            toolStripStatusLabel1.Text = "No File Open";
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("POS 409 Team 1 Directions App", "Team 1");
        }

        private void button1_Click(object sender, EventArgs e)
        {
            GetAddressQuery();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ClearTable();
        }

        private void saveToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Stream myStream;
            SaveFileDialog saveFileDialog1 = new SaveFileDialog();

            saveFileDialog1.Filter = "XML files (*.xml)|*.xml|All files (*.*)|*.*";
            saveFileDialog1.FilterIndex = 2;
            saveFileDialog1.RestoreDirectory = true;

            if (saveFileDialog1.ShowDialog() == DialogResult.OK)
            {
                if ((myStream = saveFileDialog1.OpenFile()) != null)
                {
                    xd.Save(myStream);
                    myStream.Close();
                }
            }
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void newToolStripMenuItem_Click(object sender, EventArgs e)
        {

            ClearTable();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }
    }
}
