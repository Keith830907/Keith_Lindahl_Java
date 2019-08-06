using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Newtonsoft.Json;

namespace Week4Employee
{
    public partial class Form1 : Form
    {
        public class Data
        {
            public List<Manager> Managers { get; set; }
            public List<Developer> Developers { get; set; }
        }
        Data data;

        public Form1()
        {
            data = new Data();
            data.Managers = new List<Manager>();
            data.Developers = new List<Developer>();
            InitializeComponent();

            // headings for dataContainer
            dataContainer.ColumnCount = 11;
            dataContainer.Columns[0].Name = "FirstName";
            dataContainer.Columns[1].Name = "LastName";
            dataContainer.Columns[2].Name = "StreetAddress";
            dataContainer.Columns[3].Name = "City";
            dataContainer.Columns[4].Name = "State";
            dataContainer.Columns[5].Name = "Zip";
            dataContainer.Columns[6].Name = "Age";
            dataContainer.Columns[7].Name = "Salary";
            dataContainer.Columns[8].Name = "DeveloperType";
            dataContainer.Columns[9].Name = "Title";
            dataContainer.Columns[10].Name = "Supervisor";
            
        }

        // Event handler 
        private void ButtonLoadFile_Click(object sender, EventArgs e)
        {
            // 
            openFileDialog1.Title = "Select a .json File";

            // if the file is opened read employee records
            if (openFileDialog1.ShowDialog() == DialogResult.OK)
            {
                System.IO.StreamReader sr = new System.IO.StreamReader(openFileDialog1.FileName);
                comboBox1.Enabled = true;

                SearchInput.Enabled = true;
                SearchByInput.Enabled = true;
                SearchButton.Enabled = true;
                SearchReset.Enabled = true;

                // read file 
                string json = sr.ReadToEnd();
                //List<Item> items = JsonConvert.DeserializeObject<List<Item>>(json);
                data = JsonConvert.DeserializeObject<Data>(json);

                foreach (Manager i in data.Managers)
                {
                    dataContainer.Rows.Add(i.GetRow());
                }
                foreach (Developer i in data.Developers)
                {
                    dataContainer.Rows.Add(i.GetRow());
                }
                // manager or developer

                comboBox1.Items.Clear();
               
                for (var i = 3; i <= dataContainer.RowCount; i++)
                {
                    comboBox1.Items.Add(i);
                }

                // close file 
                sr.Close();
            }
        }


        // event handler trigger
        private void comboBox1_SelectedValueChanged(object sender, EventArgs e)
        {
            
            dataContainer.Rows.Clear();
            for (var i = 0; i < (int)comboBox1.SelectedItem && i < data.Managers.Count; i++)
            {
                dataContainer.Rows.Add(data.Managers[i].GetRow());
            }
            for (var i = 0; i < (int)comboBox1.SelectedItem && i < data.Developers.Count; i++)
            {
                dataContainer.Rows.Add(data.Developers[i].GetRow());
            }
        }

        private void SearchButton_Click(object sender, EventArgs e)
        {
            var searchByIndex = SearchByInput.SelectedIndex;        
            var searchQuery = SearchInput.Text;                     
            // check if search criteria is selected
            if (searchByIndex == -1)
            {
                MessageBox.Show("Please select a search category of first name, last name, or address and Enter Search text to search for...Thank You");
                return;
            }
            // check if search text is provided
            if (searchQuery.Trim().Equals(""))
            {
                MessageBox.Show("Search text cannot be empty or there is nothing to search for...Thanks");

            }
            else
            {
                dataContainer.Rows.Clear();
                List<String[]> result = new List<string[]>();
                switch (searchByIndex)
                {
                    // searching by first name and last name
                    case 0:
                        foreach (var m in data.Managers.Where(m => m.FirstName.ToLower().Contains(searchQuery.ToLower())).ToArray())
                        {
                            result.Add(m.GetRow());
                        }
                        foreach (var d in data.Developers.Where(d => d.FirstName.ToLower().Contains(searchQuery.ToLower())).ToArray())
                        {
                            result.Add(d.GetRow());
                        }
                        break;
                    case 1:
                        foreach (var m in data.Managers.Where(m => m.LastName.ToLower().Contains(searchQuery.ToLower())).ToArray())
                        {
                            result.Add(m.GetRow());
                        }
                        foreach (var d in data.Developers.Where(d => d.LastName.ToLower().Contains(searchQuery.ToLower())).ToArray())
                        {
                            result.Add(d.GetRow());
                        }
                        break;
                    //  searching by address
                    case 2:
                        foreach (var m in data.Managers.Where(
                            manager => (manager.StreetAddress + " " + manager.City + " " + manager.State).ToLower().Contains(searchQuery.ToLower())
                        ))
                        {
                            result.Add(m.GetRow());
                        }
                        foreach (var d in data.Developers.Where(
                            developer => (developer.StreetAddress + " " + developer.City + " " + developer.State).ToLower().Contains(searchQuery.ToLower())
                        ))
                        {
                            result.Add(d.GetRow());
                        }
                        break;
                }
                foreach (var employee in result)
                {
                    dataContainer.Rows.Add(employee);
                }
            }
        }

        private void SearchReset_Click(object sender, EventArgs e)
        {
            comboBox1.SelectedIndex = 0;
            comboBox1.SelectedIndex = data.Managers.Count + data.Developers.Count - 3;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
