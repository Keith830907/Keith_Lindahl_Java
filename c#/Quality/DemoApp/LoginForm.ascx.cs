using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient; //this namespace is for sqlclient server  
using System.Configuration; // this namespace is add I am adding connection name in web config file config connection name  

namespace Quality
{
    public partial class LoginForm : System.Web.UI.UserControl
    {
        
      public string UserName { get; set;  }

      public string Password { get; set;  }


    protected void Page_Load(object sender,EventArgs e)
        {
            if (IsPostBack)
            {

                UserName = txtUserName.Text;
                Password = txtPassword.Text;
            }
            else
            {
                txtUserName.Text = UserName;
                txtPassword.Text = Password;
            }
        }
    }
}