using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Quality
{
    public partial class Contact : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnSend_Click(object sender, EventArgs e)
        {
            lblOutput.Text = string.Format("User: {0} said: {1}", cf.CompanyName, cf.Address, cf.PhoneNumber, cf.CustomerName, cf.Comments);

            MySqlConnection con = new MySqlConnection("server = localhost; userid = root; database = clientdata; password = root;");
           
            con.Open();
            var insertStatement = "INSERT into clientdata.database (CompanyName,Address,PhoneNumber,CustomerName,Comments) values (@CompanyName, @Address, @PhoneNumber, @CustomerName, @Comments)";
            MySqlCommand cmd = new MySqlCommand(insertStatement, con);
            MySqlDataAdapter adp = new MySqlDataAdapter(cmd);           
            {
                cmd.Parameters.AddWithValue("CompanyName", cf.CompanyName);
                cmd.Parameters.AddWithValue("Address", cf.Address);
                cmd.Parameters.AddWithValue("PhoneNumber", cf.PhoneNumber);
                cmd.Parameters.AddWithValue("CustomerName", cf.CustomerName);
                cmd.Parameters.AddWithValue("Comments", cf.Comments);
                cmd.ExecuteNonQuery();
                con.Close();
                
            }
        }
    }
}
