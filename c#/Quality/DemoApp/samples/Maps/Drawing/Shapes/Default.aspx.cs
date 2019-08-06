using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.UI.WebControls;
using GoogleMaps.Drawing;
using GoogleMaps.Overlays;
using GoogleMaps.Samples.Data;

namespace GoogleMaps.Samples.Maps.Drawing.Shapes
{
    public partial class Default : System.Web.UI.Page
    {
        protected override void OnPreRender(EventArgs e)
        {
            base.OnPreRender(e);

            // use entity framework context to load the data from a database
            using (var context = new DataContext())
            {
                var shapes = context.Shapes.Include("Path")
                    .OrderByDescending(x => x.ID)
                    .Take(100)
                    .ToList();
                foreach (var shape in shapes)
                {
                    GoogleMap1.Overlays.Add(new GooglePolygon
                    {
                        Paths = shape.Path.Select(x => new LatLng(x.Latitude, x.Longitute)).ToList()
                    });
                }
            }
        }

        protected void HandlePolygonComplete(object sender, DrawingPolygonEventArgs e)
        {
            // use entity framework context to persist the polygon data into a database
            using (var context = new DataContext())
            {
                var shape = new Shape { ID = Guid.NewGuid() };
                var path = new List<ShapePoint>();
                var index = 0;

                foreach (var x in e.Path)
                {
                    path.Add(new ShapePoint { Index = index++, Latitude = x.Latitude, Longitute = x.Longitude });
                }
                shape.Path = path;

                context.Shapes.Add(shape);

                context.SaveChanges();
            }
        }
    }
}
