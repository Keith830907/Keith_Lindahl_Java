using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week2DemoApp
{
    public partial class Form1 : Form
    {
        List<Manager> managers;         // list of managers
        List<Developer> developers;     // list of developers

        public Form1()
        {
            // create empty arrays and initialize count to 0
            managers = new List<Manager>();
            developers = new List<Developer>();
            InitializeComponent();

            // set the column headings for dataContainer
            dataContainer.ColumnCount = 11;
            dataContainer.Columns[0].Name = "FirstName";
            dataContainer.Columns[1].Name = "LastName";
            dataContainer.Columns[2].Name = "StreetAddress";
            dataContainer.Columns[3].Name = "City";
            dataContainer.Columns[4].Name = "State";
            dataContainer.Columns[5].Name = "Zip";
            dataContainer.Columns[6].Name = "EmployeeType";
            dataContainer.Columns[7].Name = "DeveloperType";
            dataContainer.Columns[8].Name = "CostCenter";
            dataContainer.Columns[9].Name = "Supervisor";
            dataContainer.Columns[10].Name = "TaxType";
        }

        // Event handler to run when open file button is clicked
        private void ButtonLoadFile_Click(object sender, EventArgs e)
        {
            // open a fileDIalogBox for user to choose a file
            openFileDialog1.Title = "Select a Record File";

            // if the file is opened read employee records
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                System.IO.StreamReader sr = new System.IO.StreamReader(openFileDialog1.FileName);
                comboBox1.Enabled = true;

                managers.Clear();
                developers.Clear();
                // read file untill end of stream
                while (!sr.EndOfStream)
                {
                    // read one line
                    var line = sr.ReadLine();

                    // split the line into array, using comma as delimiter
                    var values = line.Replace(", ", ",").Split(',');

                    // check if employee is manager or developer
                    if (values[6].Trim().Equals("Manager"))
                    {
                        // add new manager to list
                        managers.Add(new Manager(values[0], values[1], values[2], values[3], values[4], values[5], values[8], values[9]));
                    }
                    else
                    {
                        // add new developer to list
                        developers.Add(new Developer(values[0], values[1], values[2], values[3], values[4], values[5], values[7], values[9], values[10]));
                    }
                    // add new row to dataContainer
                    dataContainer.Rows.Add(values);
                }
                comboBox1.Items.Clear();
                // add options to comobox
                for (var i = 3; i <= dataContainer.RowCount; i++)
                {
                    comboBox1.Items.Add(i);
                }

                // close file read stream
                sr.Close();
            }
        }


        // event handler triggered when combobox value changes
        private void comboBox1_SelectedValueChanged(object sender, EventArgs e)
        {
            // clear the dataContainer and add required number of rows
            dataContainer.Rows.Clear();
            for (var i = 0; i < (int)comboBox1.SelectedItem && i < managers.Count; i++)
            {
                dataContainer.Rows.Add(managers[i].GetRow());
            }
            for (var i = 0; i < (int)comboBox1.SelectedItem && i < developers.Count; i++)
            {
                dataContainer.Rows.Add(developers[i].GetRow());
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}