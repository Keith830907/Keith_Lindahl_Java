using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace POS409_Team1.GoogleMaps
{
    public class DirectionsResponse
    {
        [XmlElement("geocoded_waypoint")]
        public List<GeocodedWaypoint> geocoded_waypoints { get; set; }
        [XmlArrayItem("route")]
        public List<Route> routes { get; set; }
        public string status { get; set; }
    }

    public class GeocodedWaypoint
    {
        public string geocoder_status { get; set; }
        public string place_id { get; set; }
        public List<string> types { get; set; }
    }

    public class MapPoint
    {
        public double lat { get; set; }
        public double lng { get; set; }

        public override string ToString()
        {
            return "Lat: " + lat + " Lng: " + lng;
        }
    }

    public class Bounds
    {
        public MapPoint northeast { get; set; }
        public MapPoint southwest { get; set; }
    }


    public class Duration
    {
        public string text { get; set; }
        public int value { get; set; }
        public override string ToString()
        {
            return text;
        }
    }


    public class Polyline
    {
        public string points { get; set; }
    }
}
