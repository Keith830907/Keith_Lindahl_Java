using System;
using System.Linq;
using System.Web.UI;
using System.Web.UI.WebControls;
using GoogleMaps.Samples.Data;

namespace GoogleMaps.Samples.Maps.DataBinding
{
    public partial class Default : Page
    {
        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            if (!IsPostBack)
            {
                LoadMapStates();
            }
        }

        protected void HandleSaveClick(object sender, EventArgs e)
        {
            var map = fvGooleDataBound.FindControl("GoogleMap1") as GoogleMap;
            if ((map != null) && (map.Center != null))
            {
                var state = new Data.State
                {
                    Latitude = map.Center.Latitude,
                    Longitude = map.Center.Longitude,
                    MapType = map.MapType,
                    Name = txtName.Text ?? "Unnamed",
                    Zoom = map.Zoom
                };
                using (var context = new DataContext())
                {
                    context.States.Add(state);
                    context.SaveChanges();
                }
            }
            txtName.Text = null;
            LoadMapStates();
        }

        private void LoadMapStates()
        {
            lbStates.Items.Clear();
            using (var context = new DataContext())
            {
                var items = context.States
                    .OrderByDescending(x => x.ID)
                    .Take(10)
                    .Select(x => new ListItem
                    {
                        Text = x.Name,
                        Value = x.ID.ToString()
                    })
                    .ToArray();
                lbStates.Items.AddRange(items);
            }
        }
    }
}