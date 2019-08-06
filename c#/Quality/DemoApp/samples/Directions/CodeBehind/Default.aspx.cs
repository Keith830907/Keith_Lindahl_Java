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
#pragma warning disable CS0618 // Type or member is obsolete
                GoogleMap1.Directions.Add(new GoogleDirections
#pragma warning restore CS0618 // Type or member is obsolete
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
