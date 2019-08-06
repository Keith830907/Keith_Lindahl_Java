using System;
using System.Collections.Generic;
using System.Drawing;
using GoogleMaps.Overlays;

namespace GoogleMaps.Samples.samples.Overlays.CodeBehind
{
    public partial class Default : System.Web.UI.Page
    {
        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

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
            polygon.Click += Polygon_Click;
        }

        private void Polygon_Click(object sender, MouseEventArgs e)
        {
            lblInfo.Text = string.Format("Polygon clicked at {0}", e.Position);
        }
    }
}
