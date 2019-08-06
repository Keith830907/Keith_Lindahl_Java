using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Serialization;

namespace POS409_Team1.GoogleMaps
{
    public class Route
    {
        public Bounds bounds { get; set; }
        public string copyrights { get; set; }
        [XmlArrayItem("leg")]
        public List<Leg> legs { get; set; }
        public Polyline overview_polyline { get; set; }
        public string summary { get; set; }
        public List<object> warnings { get; set; }
        public List<object> waypoint_order { get; set; }
    }
}
