using System;
using System.Web.UI.WebControls;

namespace GoogleMaps.Samples.Maps
{
    public partial class Bounds : System.Web.UI.Page
    {
        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);
            GoogleMap1.Width = Unit.Percentage(100);
            // TODO uncoment to use in code-behind
            //GoogleMap1.Bounds = new Bounds
            //{
            //    NorthEast = new LatLng(42.2697868981211, 24.9835939697266),
            //    SouthWest = new LatLng(42.02542336268529, 24.5441408447266)
            //};
        }
    }
}