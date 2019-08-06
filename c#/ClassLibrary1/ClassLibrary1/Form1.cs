using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Linq;

namespace Team1Week4

{
    public partial class Form1 : Form
    {
        string filePath = string.Empty;
        DataTable stepsTable = new DataTable("StepsTable");
        List<string> stepsList = new List<string>();
        List<string> durationList = new List<string>();
        List<string> distanceList = new List<string>();

        public Form1()
        {
            InitializeComponent();
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

                    filePath = openFileDialog.FileName;
                    XDocument xDoc = XDocument.Load(filePath);
                    startAddressQuery(xDoc);
                    endAddressQuery(xDoc);
                    totalDistanceQuery(xDoc);
                    totalTimeQuery(xDoc);
                    ReadSteps(xDoc);
                    CreateStepsTable();
                }
            }
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

        private void CreateStepsTable()
        {
            DataColumn column;
            DataRow row;

            column = new DataColumn("Direction");
            stepsTable.Columns.Add(column);

            column = new DataColumn("Distance");
            stepsTable.Columns.Add(column);

            column = new DataColumn("Time");
            stepsTable.Columns.Add(column);


            var stepAndDistance = stepsList.Zip(distanceList, (st, di) => new { step = st, distance = di });
            var stepParts = stepAndDistance.Zip(durationList, (sd, du) => new { stepAndDistance = sd, duration = du });

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
                row["Direction"] = step.stepAndDistance.step;
                row["Distance"] = distance + " mi";
                row["Time"] = time;
                stepsTable.Rows.Add(row);
            }

            dataGridView1.DataSource = stepsTable;

        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("POS 409 Team 1");
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}