using System.Collections.Generic;
using System.Xml.Serialization;

namespace POS409_Team1.GoogleMaps
{
    public class Leg
    {
        public Distance distance { get; set; }
        public Duration duration { get; set; }
        public string end_address { get; set; }
        public MapPoint end_location { get; set; }
        public string start_address { get; set; }
        public MapPoint start_location { get; set; }
        [XmlElement("step")]
        public List<Step> steps { get; set; }
        public List<object> traffic_speed_entry { get; set; }
        public List<object> via_waypoint { get; set; }
    }
}
