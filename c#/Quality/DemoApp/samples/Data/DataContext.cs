using System;
using System.Data.Entity;

namespace GoogleMaps.Samples.Data
{
    public class DataContext : DbContext
    {
        public DataContext() : base("Samples") { }

        public DbSet<Shape> Shapes { get; set; }
        public DbSet<State> States { get; set; }

        protected override void OnModelCreating(DbModelBuilder builder)
        {
            base.OnModelCreating(builder);

            builder.Entity<ShapePoint>().HasKey(x => new { x.ShapeID, x.Index });
        }
    }
}