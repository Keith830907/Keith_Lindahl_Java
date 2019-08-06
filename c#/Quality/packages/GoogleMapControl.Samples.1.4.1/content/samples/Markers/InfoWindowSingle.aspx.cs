using System;
using System.Web.UI.WebControls;
using GoogleMaps.Markers;

namespace GoogleMaps.Samples.Markers
{
    public partial class InfoWindowSingle : System.Web.UI.Page
    {
        protected override void OnInit(EventArgs e)
        {
            base.OnInit(e);

            var map = new GoogleMap(new LatLng(42.1229, 24.7879), 6);
            map.ID = "GoogleMap1";
            map.CssClass = "map";
            map.DisableMultipleInfoWindows = true;
            map.EnableScrollWheelZoom = true;
            map.FullscreenControl = true;
            map.Width = Unit.Percentage(100);
            map.Height = Unit.Pixel(600);

            var markers = new GoogleMarkers();
            markers.Markers.Add(new Marker { Position = new LatLng(42.1229, 24.7879), Info = "<a href='http://www.google.com'>Google.com</a>" });
            markers.Markers.Add(new Marker { Position = new LatLng(42.7, 23.3), Info = "<a href='http://www.microsoft.com'>Microsoft.com</a>" });

            map.Markers.Add(markers);

            pnlControls.Controls.Add(map);
        }
    }
}