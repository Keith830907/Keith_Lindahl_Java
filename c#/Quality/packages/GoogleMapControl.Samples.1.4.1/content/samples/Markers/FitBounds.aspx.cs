using System;
using System.Collections.Generic;
using GoogleMaps.Markers;

namespace GoogleMaps.Samples.Markers
{
    public partial class FitBounds : System.Web.UI.Page
    {
        private readonly Random _random = new Random();

        protected void Page_Load(object sender, EventArgs e)
        {
            GoogleMarkers1.Markers.AddRange(GetMarkers());
        }

        private IEnumerable<Marker> GetMarkers()
        {
            for (int i = 1; i <= 10; i++)
            {
                yield return new Marker
                {
                    Position = GetRandomPoint(),
                    Title = $"Markers {i}"
                };
            }
        }

        private LatLng GetRandomPoint()
        {
            var lat = 42.1229 + (_random.NextDouble() - 0.5) * (14.5 * _random.NextDouble());
            var lng = 24.7879 + (_random.NextDouble() - 0.5) * (36.0 * _random.NextDouble());
            return new LatLng(Math.Round(lat, 3), Math.Round(lng, 3));
        }
    }
}