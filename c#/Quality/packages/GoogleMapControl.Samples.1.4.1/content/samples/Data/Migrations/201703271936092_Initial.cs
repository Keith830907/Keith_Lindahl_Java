namespace GoogleMaps.Samples.Data.Migrations
{
    using System;
    using System.Data.Entity.Migrations;
    
    public partial class Initial : DbMigration
    {
        public override void Up()
        {
            CreateTable(
                "dbo.Shapes",
                c => new
                    {
                        ID = c.Guid(nullable: false),
                    })
                .PrimaryKey(t => t.ID);
            
            CreateTable(
                "dbo.ShapePoints",
                c => new
                    {
                        ShapeID = c.Guid(nullable: false),
                        Index = c.Int(nullable: false),
                        Latitude = c.Double(nullable: false),
                        Longitute = c.Double(nullable: false),
                    })
                .PrimaryKey(t => new { t.ShapeID, t.Index })
                .ForeignKey("dbo.Shapes", t => t.ShapeID, cascadeDelete: true)
                .Index(t => t.ShapeID);
            
        }
        
        public override void Down()
        {
            DropForeignKey("dbo.ShapePoints", "ShapeID", "dbo.Shapes");
            DropIndex("dbo.ShapePoints", new[] { "ShapeID" });
            DropTable("dbo.ShapePoints");
            DropTable("dbo.Shapes");
        }
    }
}
