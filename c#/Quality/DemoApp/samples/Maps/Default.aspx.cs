using System;
using System.Collections.Generic;
using System.Web.UI.WebControls;

namespace GoogleMaps.Samples.Maps
{
    public partial class Default : System.Web.UI.Page
    {
        public GoogleMap GetMap()
        {
            return GoogleMap1;
        }

        public IEnumerable<string> GetMapTypes()
        {
            yield return MapType.Hybrid.ToString();
            yield return MapType.Roadmap.ToString();
            yield return MapType.Satellite.ToString();
            yield return MapType.Terrain.ToString();
        }

        public void UpdateMap()
        {
            // we are using the new model binding feature of ASP.NET Web Forms here
            TryUpdateModel(GoogleMap1);

            var dropDown = fvOptions.FindControl("ddlMapType") as DropDownList;
            MapType mapType;
            if (Enum.TryParse(dropDown.SelectedValue, out mapType))
            {
                GoogleMap1.MapType = mapType;
            }
        }
    }
}
