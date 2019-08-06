using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace JohnQualitySharpening.Private
{
    public partial class Data : System.Web.UI.Page
    {
        string connectionstring = @"Server=localhost;Database=client; User ID = root; Password=Logan@2007;";
        

        protected void Page_Load(object sender, EventArgs e)

        {
            if (!IsPostBack)
            {
                Clear();
                GridFill();
                
            }
        }

        protected void btnSave_Click(object sender, EventArgs e)
        {
            try
            {
                using (MySqlConnection sqlCon = new MySqlConnection(connectionstring))
                {
                    sqlCon.Open();

                    MySqlCommand sqlCmd = new MySqlCommand("ClientAddOrEdit", sqlCon);
                    sqlCmd.CommandType = CommandType.StoredProcedure;
                    sqlCmd.Parameters.AddWithValue("_ID", Convert.ToInt32(hfID.Value == "" ? "0" : hfID.Value));
                    sqlCmd.Parameters.AddWithValue("_NextCall", txtNextCall.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_Customer", txtCustomer.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_Address", txtAddress.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_City", txtCity.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_State", txtState.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_Zip", txtZip.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_PhoneNumber", txtPhoneNumber.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_CALLER", txtCALLER.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_LastCall", txtLastCall.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_TimeSinceLastCall", txtTimeSinceLastCall.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_CustomerContact", txtCustomerContact.Text.Trim());
                    sqlCmd.Parameters.AddWithValue("_Comments", txtComments.Text.Trim());
                    sqlCmd.ExecuteNonQuery();
                    GridFill();
                    Clear();
                    lblSuccessMessage.Text = "Submitted Successfully";
                }
            }
            catch (Exception ex)
            {

                lblErrorMessage.Text = ex.Message;
            }
        }

        void Clear()
        {
            hfID.Value = "";
            txtID.Text = txtNextCall.Text = txtCustomer.Text = txtAddress.Text = txtCity.Text = txtState.Text= txtZip.Text = txtPhoneNumber.Text = txtCALLER.Text = txtLastCall.Text = txtTimeSinceLastCall.Text = txtCustomerContact.Text = txtComments.Text = "";
            btnSave.Text = "Save";
            btnDelete.Enabled = false;
            lblErrorMessage.Text = lblSuccessMessage.Text = "";
        }

        protected void btnClear_Click(object sender, EventArgs e)
        {
            Clear();
        }

        void GridFill()
        {
            using (MySqlConnection sqlCon = new MySqlConnection(connectionstring))
            {
                sqlCon.Open();
                MySqlDataAdapter sqlDa = new MySqlDataAdapter("ClientViewAll", sqlCon);
                sqlDa.SelectCommand.CommandType = CommandType.StoredProcedure;
                DataTable dtbl = new DataTable();
                sqlDa.Fill(dtbl);
                Clientview.DataSource = dtbl;
                Clientview.DataBind();
            }
        }

        


        protected void lnkSelect_OnClick(object sender, EventArgs e)
        {
            int ID = Convert.ToInt32(value: (sender as LinkButton).CommandArgument);
            using (MySqlConnection sqlCon = new MySqlConnection(connectionstring))
            {
                sqlCon.Open();
                MySqlDataAdapter sqlDa = new MySqlDataAdapter("ClientViewByID", sqlCon);
                sqlDa.SelectCommand.Parameters.AddWithValue("_ID", ID);
                sqlDa.SelectCommand.CommandType = CommandType.StoredProcedure;
                DataTable dtbl = new DataTable();
                sqlDa.Fill(dtbl);
                txtID.Text = dtbl.Rows[0][0].ToString();
                txtNextCall.Text = dtbl.Rows[0][1].ToString();
                txtCustomer.Text = dtbl.Rows[0][2].ToString();
                txtAddress.Text = dtbl.Rows[0][3].ToString();
                txtCity.Text = dtbl.Rows[0][4].ToString();
                txtState.Text = dtbl.Rows[0][5].ToString();
                txtZip.Text = dtbl.Rows[0][6].ToString();
                txtPhoneNumber.Text = dtbl.Rows[0][7].ToString();
                txtCALLER.Text = dtbl.Rows[0][8].ToString();
                txtLastCall.Text = dtbl.Rows[0][9].ToString();
                txtTimeSinceLastCall.Text = dtbl.Rows[0][10].ToString();
                txtCustomerContact.Text = dtbl.Rows[0][11].ToString();
                txtComments.Text = dtbl.Rows[0][12].ToString();

                hfID.Value = dtbl.Rows[0][0].ToString();

                btnSave.Text = "Update";
                btnDelete.Enabled = true;
            }
        }

        

                //AIzaSyCjJPsjSdaDd7zuv4skNmHEsHaCJ1wvyPs
                 protected void lnkMap_OnClick(object sender, EventArgs e)
                 {

                     int ID = Convert.ToInt32(value: (sender as LinkButton).CommandArgument);
                     using (MySqlConnection sqlCon = new MySqlConnection(connectionstring))
                     {
                         sqlCon.Open();
                         MySqlDataAdapter sqlDa = new MySqlDataAdapter("SelectMapByID", sqlCon);
                         sqlDa.SelectCommand.Parameters.AddWithValue("_ID", ID);
                         sqlDa.SelectCommand.CommandType = CommandType.StoredProcedure;
                         DataTable dtblMap = new DataTable();
                         sqlDa.Fill(dtblMap);
                         txtAddress.Text = dtblMap.Rows[0][3].ToString();
                         txtCity.Text = dtblMap.Rows[0][4].ToString();
                         txtState.Text = dtblMap.Rows[0][5].ToString();
                         txtZip.Text = dtblMap.Rows[0][6].ToString();

                         hfID.Value = dtblMap.Rows[0][0].ToString();

                
                     }
                 }

                protected void btnDelete_Click(object sender, EventArgs e)
        {
            using (MySqlConnection sqlCon = new MySqlConnection(connectionstring))
            {
                sqlCon.Open();

                MySqlCommand sqlCmd = new MySqlCommand("ClientDeleteByID", sqlCon);
                sqlCmd.CommandType = CommandType.StoredProcedure;
                sqlCmd.Parameters.AddWithValue("_ID", Convert.ToInt32(hfID.Value == "" ? "0" : hfID.Value));
                sqlCmd.ExecuteNonQuery();
                GridFill();
                Clear();
                lblSuccessMessage.Text = "Deleted Successfully";
            }
        }


       
        protected void GridView1_RowDataBound(object sender, GridViewRowEventArgs e)
        {

            //Checking the RowType of the Row  
            if (e.Row.RowType == DataControlRowType.DataRow)
            {
                DateTime firstDateValue = Convert.ToDateTime(e.Row.Cells[1].Text);
                DateTime secondDateValue = Convert.ToDateTime(e.Row.Cells[9].Text);

                TimeSpan timespan = firstDateValue - secondDateValue;

                if (timespan.Days <= 7)
                {
                    e.Row.BackColor = Color.Green;
                }
                else if (timespan.Days >= 21)
                {
                    e.Row.BackColor = Color.Red;
                }
                else 
                {
                    e.Row.BackColor = Color.Yellow;
                }
            }  
        }
    }
}


