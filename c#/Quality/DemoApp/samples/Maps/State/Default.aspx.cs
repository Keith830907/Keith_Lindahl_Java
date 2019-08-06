using System;

namespace GoogleMaps.Samples.Maps.State
{
    public partial class Default : System.Web.UI.Page
    {
        protected void HandleSaveClick(object sender, EventArgs e)
        {
            var state = new State
            {
                Center = GoogleMap1.Center,
                MapType = GoogleMap1.MapType,
                Zoom = GoogleMap1.Zoom
            };
            Session["MapState"] = state;
        }

        protected void HandleLoadClick(object sender, EventArgs e)
        {
            var state = Session["MapState"] as State;
            if(state != null)
            {
                GoogleMap1.Center = state.Center;
                GoogleMap1.MapType = state.MapType;
                GoogleMap1.Zoom = state.Zoom;
            }
        }

        class State
        {
            public LatLng Center;
            public MapType MapType;
            public int Zoom;
        }
    }
}
