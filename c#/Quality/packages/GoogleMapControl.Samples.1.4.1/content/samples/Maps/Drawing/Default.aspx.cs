using GoogleMaps.Drawing;

namespace GoogleMaps.Samples.Maps.Drawing
{
    public partial class Default1 : System.Web.UI.Page
    {
        protected void GoogleManager1_CircleComplete(object sender, DrawingCircleEventArgs e)
        {
            lblInfo.Text = "CircleComplete - " + e;
        }

        protected void GoogleManager1_MarkerComplete(object sender, DrawingMarkerEventArgs e)
        {
            lblInfo.Text = "MarkerComplete - " + e;
        }

        protected void GoogleManager1_PolygonComplete(object sender, DrawingPolygonEventArgs e)
        {
            lblInfo.Text = "PolygonComplete - " + e;
        }

        protected void GoogleManager1_PolylineComplete(object sender, DrawingPolylineEventArgs e)
        {
            lblInfo.Text = "PolylineComplete - " + e;
        }

        protected void GoogleManager1_RectangleComplete(object sender, DrawingRectangleEventArgs e)
        {
            lblInfo.Text = "RectangleComplete - " + e;
        }

        protected void GoogleManager1_OverlayComplete(object sender, DrawingOverlayEventArgs e)
        {
            lblInfo.Text = "OverlayComplete - " + e;
        }
    }
}