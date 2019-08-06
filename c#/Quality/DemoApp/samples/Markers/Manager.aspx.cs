using System;
using System.Collections.Generic;
using GoogleMaps;
using GoogleMaps.Markers;

namespace GoogleMaps.Samples.Markers
{
    public partial class Manager : System.Web.UI.Page
    {
        private static readonly string[] Images = new[] { "sun", "rain", "snow", "storm" };
        private readonly Random _random = new Random();

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            MarkersExtender.Markers.AddRange(GetWeatherMarkers(20, 3));
            MarkersExtender.Markers.AddRange(GetWeatherMarkers(200, 6));
            MarkersExtender.Markers.AddRange(GetWeatherMarkers(1000, 8));
        }

        private IEnumerable<Marker> GetWeatherMarkers(int count, int zoomLevel)
        {
            int index;
            for (int i = 0; i < count; i++)
            {
                index = _random.Next(0, Images.Length);
                yield return new Marker
                {
                    Position = GetRandomPoint(),
                    Icon = new MarkerImage
                    {
                        Size = new Size(32, 32),
                        Anchor = new Point(0, 0),
                        Url = "/images/icons/" + Images[index] + ".png"
                    },
                    Shadow = new MarkerImage
                    {
                        Size = new Size(32, 59),
                        Anchor = new Point(0, 0),
                        Url = "/images/icons/" + Images[index] + "-shadow.png"
                    },
                    Shape = new MarkerShape { Coords = new[] { 1, 1, 1, 32, 32, 32, 32, 1 }, Type = MarkerShapeType.Poly },
                    Title = "Weather marker",
                    ZoomLevel = zoomLevel
                };
            }
        }

        private LatLng GetRandomPoint()
        {
            var lat = 48.25 + (_random.NextDouble() - 0.5) * 14.5;
            var lng = 11.00 + (_random.NextDouble() - 0.5) * 36.0;
            return new LatLng(Math.Round(lat, 2), Math.Round(lng, 2));
        }
    }
}