using GoogleMaps.Directions;

namespace GoogleMaps.Samples.samples.Directions.ServerEvents
{
    public partial class Default : System.Web.UI.Page
    {
        protected void HandleDirectionsChanged(object sender, DirectionsChangedEventArgs e)
        {
            phRoutes.Controls.Clear();
            //phRoutes.Controls.Add(new RouteRenderer(e));
        }
    }
}
