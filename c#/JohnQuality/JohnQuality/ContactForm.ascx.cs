using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace JohnQuality
{
    public partial class ContactForm : System.Web.UI.UserControl
    {

        public string CompanyName { get; set; }

        public string Address { get; set; }

        public string PhoneNumber { get; set; }

        public string CustomerName { get; set; }

        public string Comments { get; set; }

        protected void Page_Load(object sender, EventArgs e)
        {
            if (IsPostBack)
            {
                
                CompanyName = txtCompanyName.Text;
                Address = txtAddress.Text;
                PhoneNumber = txtPhoneNumber.Text;
                CustomerName = txtCustomerName.Text;
                Comments = txtComments.Text;
            }
            else
            {
               
                txtCompanyName.Text = CompanyName;
                txtAddress.Text = Address;
                txtPhoneNumber.Text = PhoneNumber;
                txtCustomerName.Text = CustomerName;
                txtComments.Text = Comments;
            }
        }
    }
}