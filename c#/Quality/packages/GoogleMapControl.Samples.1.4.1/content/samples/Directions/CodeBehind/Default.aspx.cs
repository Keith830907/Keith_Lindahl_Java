using System;
using GoogleMaps.Directions;

namespace GoogleMaps.Samples.samples.Directions.CodeBehind
{
    public partial class Default : System.Web.UI.Page
    {
        protected void HandleShowClick(object sender, EventArgs e)
        {

            var destination = txtDestination.Text;
            var origin = txtOrigin.Text;
            if ((origin != null) && (destination != null))
            {
                GoogleMap1.Directions.Add(new GoogleDirections
                {
                    Destination = new Location(destination),
                    Origin = new Location(origin),
                    Draggable = true,
                    PanelID = "route"
                });
            }
        }
    }
}
