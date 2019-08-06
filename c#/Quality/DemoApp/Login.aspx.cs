using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using MySql.Data.MySqlClient;

namespace Quality
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Btn2Send_Click(object sender, EventArgs e)
        {
            logOutput.Text = string.Format("User: {0} said: {1}", lg.UserName, lg.Password);

            MySqlConnection conn = new MySqlConnection("server = localhost; userid = root; database = clientdata; password = root;");

            conn.Open();
            var insertStatement = "INSERT into clientdata.logindata (UserName, Password) values (@UserName, @Password)";
            MySqlCommand cmd = new MySqlCommand(insertStatement, conn);
            MySqlDataAdapter adp = new MySqlDataAdapter(cmd);
            {
                cmd.Parameters.AddWithValue("UserName", lg.UserName);
                cmd.Parameters.AddWithValue("Password", lg.Password);
               
                cmd.ExecuteNonQuery();
                conn.Close();

            }
        }

    }

}
