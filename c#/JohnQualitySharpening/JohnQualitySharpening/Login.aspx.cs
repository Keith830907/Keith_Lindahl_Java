using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using MySql.Data.MySqlClient;

namespace JohnQualitySharpening
{
    public partial class LoginView : System.Web.UI.Page
    {


        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("C:\\Users\\keith\\source\\repos\\JohnQualitySharpening\\JohnQualitySharpening\\Private\\Data.aspx");
        }
    }
}
