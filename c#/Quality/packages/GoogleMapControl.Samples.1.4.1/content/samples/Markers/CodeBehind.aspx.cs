using System;
using System.Collections.Generic;
using System.Drawing;
using GoogleMaps.Markers;
using GoogleMaps.Overlays;

namespace GoogleMaps.Samples.Markers
{
    public partial class CodeBehind : System.Web.UI.Page
    {
        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            GoogleMarkers markers = new GoogleMarkers();

            markers.Markers.Add(new Marker
            {
                Position = new LatLng(42.1229, 24.7879),
                Title = "Click on me",
                Info = "Text info on marker 1"
            });
            markers.Markers.Add(new Marker
            {
                Position = new LatLng(42.7, 23.3),
                Title = "Click on me",
                Info = "Text info on marker 2"
            });
            markers.MarkerOptions.Clickable = true;
            markers.MarkerOptions.Draggable = true;
            markers.Click += HandleClick;

            GoogleMap1.Markers.Add(markers);

            var circle = new GoogleCircle
            {
                Draggable = true,
                Editable = true,
                Center = new LatLng(42.1229, 24.7879),
                Radius = 200000
            };
            var polygon = new GooglePolygon
            {
                Draggable = true,
                Editable = true,
                FillColor = Color.Red,
                FillOpacity = .5F,
                StrokeColor = Color.Black,
                StrokeWeight = 5,
                Paths = new List<LatLng> {
                    new LatLng(37.97918, 23.716647),
                    new LatLng(41.036501, 28.984895),
                    new LatLng(44.447924, 26.097879),
                    new LatLng(44.802416, 20.465601),
                    new LatLng(42.002411, 21.436097),
                    new LatLng(37.97918, 23.716647),
                    new LatLng(37.97918, 23.716647)
                }
            };
            var rectangle = new GoogleRectangle
            {
                Draggable = true,
                Editable = true,
                FillColor = Color.Green,
                Bounds = new Bounds
                {
                    SouthWest = new LatLng(44.802416, 20.465601),
                    NorthEast = new LatLng(37.97918, 23.716647)
                }
            };
            GoogleMap1.Overlays.Add(circle);
            GoogleMap1.Overlays.Add(polygon);
            GoogleMap1.Overlays.Add(rectangle);

            // add server side click handler on polygon only
            //polygon.Click += Polygon_Click;
        }

        protected void HandleClick(object sender, MarkerEventArgs e)
        {
            int? index = e.Index;

            // this is the position od the clicked marker.
            LatLng position = e.Position;

            if(index.HasValue)
            {
                var markers = (GoogleMarkers)sender;
                var marker = markers.Markers[index.Value];
                // This now should be the clicked marker with all its data.
            }
        }
    }
}