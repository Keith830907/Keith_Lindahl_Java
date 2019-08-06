using System;
using System.ComponentModel.DataAnnotations;

namespace GoogleMaps.Samples.Data
{
    public class ShapePoint
    {
        public Guid ShapeID { get; set; }

        public int Index { get; set; }

        public double Latitude { get; set; }

        public double Longitute { get; set; }
    }
}