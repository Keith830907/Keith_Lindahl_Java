using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace GoogleMaps.Samples.Maps.Static
{
    public partial class Default : System.Web.UI.Page
    {
        protected void HandleShowClick(object sender, EventArgs e)
        {
            string point = txtPoint.Text;
            if (!string.IsNullOrEmpty(point))
            {
                string[] pair = point.Split(new char[] { '/' }, StringSplitOptions.RemoveEmptyEntries);
                if (pair.Length == 2)
                {
                    double lat, lng;

                    if (double.TryParse(pair[0], out lat))
                    {
                        if (double.TryParse(pair[1], out lng))
                        {
                            GoogleMap1.Center.Latitude = lat;
                            GoogleMap1.Center.Longitude = lng;
                        }
                    }
                }
            }
            else 
            {
                string address = txtAddress.Text;
                if (!string.IsNullOrEmpty(address))
                {
                    GoogleMap1.Address = address;
                    GoogleMap1.Center = null;
                }
            }

            txtAddress.Text = null;
            txtPoint.Text = null;
        }

    }
}