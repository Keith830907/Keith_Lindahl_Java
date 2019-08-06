using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace GoogleMaps.Samples.Data
{
    public class State
    {
        [Key]
        public long ID { get; set; }

        [MaxLength(80)]
        public string Name { get; set; }

        public double Latitude { get; set; }

        public double Longitude { get; set; }

        public MapType MapType { get; set; }

        public int Zoom { get; set; }
    }
}