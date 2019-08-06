using System;

namespace GoogleMaps.Samples.Directions
{
    public partial class Default : System.Web.UI.Page
    {
        protected void HandleShowClick(object sender, EventArgs e)
        {
            string destination = txtDestination.Text;
            string origin = txtOrigin.Text;
            if ((origin != null) && (destination != null))
            {
                GoogleDirections1.Destination.Address = destination;
                GoogleDirections1.Origin.Address = origin;
            }
        }
    }
}