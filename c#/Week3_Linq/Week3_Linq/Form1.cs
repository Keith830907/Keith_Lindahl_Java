using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week3_Linq
{
    public partial class Form1 : Form
    {
        List<Manager> managers;// managers list
        List<Developer> developers;// developers list

        public Form1()
        {
            
            managers = new List<Manager>();
            developers = new List<Developer>();
            InitializeComponent();

            //column headings for dataContainer
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

        // Event handler 
        private void ButtonLoadFile_Click(object sender, EventArgs e)
        {
            // fileDIalogBox for user to choose a file
            openFileDialog1.Title = "Select a .csv File";
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                System.IO.StreamReader sr = new System.IO.StreamReader(openFileDialog1.FileName);
                comboBox1.Enabled = true;

                SearchInput.Enabled = true;
                SearchByInput.Enabled = true;
                SearchButton.Enabled = true;
                SearchReset.Enabled = true;

                managers.Clear();
                developers.Clear();
                // read file .csv
                while (!sr.EndOfStream)
                {
                    
                    var line = sr.ReadLine();

                    // comma delimiter for .csv files
                    var dataInfo = line.Replace(", ", ",").Split(',');

                    // see if employee is a manager or a developer
                    if (dataInfo[6].Trim().Equals("Manager"))
                    {
                        // add new manager 
                        managers.Add(new Manager(dataInfo[0], dataInfo[1], dataInfo[2], dataInfo[3], dataInfo[4], dataInfo[5], dataInfo[8], dataInfo[9]));
                    }
                    else
                    {
                        // add new developer 
                        developers.Add(new Developer(dataInfo[0], dataInfo[1], dataInfo[2], dataInfo[3], dataInfo[4], dataInfo[5], dataInfo[7], dataInfo[9], dataInfo[10]));
                    }
                    // add new row to dataContainer
                    dataContainer.Rows.Add(dataInfo);
                }
                comboBox1.Items.Clear();
                // add options to combobox
                for (var i = 3; i <= dataContainer.RowCount; i++)
                {
                    comboBox1.Items.Add(i);
                }

                // close file read stream
                sr.Close();
            }
        }


        // event handler trigger
        private void comboBox1_SelectedValueChanged(object sender, EventArgs e)
        {
            // clear the dataContainer 
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

        private void SearchButton_Click(object sender, EventArgs e)
        {
            var indexSearch = SearchByInput.SelectedIndex;        // obtain the search criteria
            var querySearch = SearchInput.Text;                     // obtain the string to search for
            // check if search criteria is selected
            if (indexSearch == -1)
            {
                MessageBox.Show("Select either First name, Last name, or address and Enter Search text to compare below!!! You cannot select nothing!!!");
                return;
            }
            // check if search text is provided
            if (querySearch.Trim().Equals(""))
            {
                MessageBox.Show("Search text cannot be left empty!!!Enter something to compare against!!!");

            }
            else
            {
                dataContainer.Rows.Clear();
                List<String[]> results = new List<string[]>();
                switch (indexSearch)
                {
                    //  search by first name or last name
                    case 0:
                    case 1:
                        foreach (var m in this.managers.Where(manager => manager.GetRow()[indexSearch].ToLower().Contains(querySearch.ToLower())))
                        {
                            results.Add(m.GetRow());
                        }
                        foreach (var m in this.developers.Where(developer => developer.GetRow()[indexSearch].ToLower().Contains(querySearch.ToLower())))
                        {
                            results.Add(m.GetRow());
                        }
                        break;
                    // search by address
                    case 2:
                        foreach (var m in this.managers.Where(
                            manager => (manager.GetRow()[indexSearch] + " " + manager.GetRow()[indexSearch + 1] + " " + manager.GetRow()[indexSearch + 2]).ToLower().Contains(querySearch.ToLower())
                        ))
                        {
                            results.Add(m.GetRow());
                        }
                        foreach (var d in this.developers.Where(
                            developer => (developer.GetRow()[indexSearch] + " " + developer.GetRow()[indexSearch + 1] + " " + developer.GetRow()[indexSearch + 2]).ToLower().Contains(querySearch.ToLower())
                        ))
                        {
                            results.Add(d.GetRow());
                        }
                        break;
                }
                foreach (var employee in results)
                {
                    dataContainer.Rows.Add(employee);
                }
            }
        }
        //reset table
        private void SearchReset_Click(object sender, EventArgs e)
        {
            comboBox1.SelectedIndex = 0;
            comboBox1.SelectedIndex = managers.Count + developers.Count - 3;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
