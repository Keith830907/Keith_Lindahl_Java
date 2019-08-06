using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace GoogleMaps.Samples.Data
{
    public class Shape
    {
        [Key]
        public Guid ID { get; set; }

        public ICollection<ShapePoint> Path { get; set; }
    }
}