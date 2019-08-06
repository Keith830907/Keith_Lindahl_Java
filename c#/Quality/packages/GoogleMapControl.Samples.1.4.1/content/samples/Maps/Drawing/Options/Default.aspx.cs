using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.UI.WebControls;
using GoogleMaps.Drawing;

namespace GoogleMaps.Samples.Maps.Drawing.Options
{
    public partial class Default : System.Web.UI.Page
    {
        public IEnumerable<ListItem> GetDrawingModes()
        {
            var list = new List<ListItem>();

            foreach (var item in DrawingOverlayType.Values)
            {
                var li = new ListItem(item);
                li.Selected = GoogleManager1.DrawingControlOptions.DrawingModes.Contains(item);
                list.Add(li);
            }

            return list;
        }

        public IEnumerable<string> GetDrawingControlPosition()
        {
            foreach (var item in Enum.GetValues(typeof(ControlPosition)))
            {
                yield return item.ToString();
            }
        }

        public bool GetSelectedDrawingControl()
        {
            return GoogleManager1.DrawingControl;
        }

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            if (!IsPostBack)
            {
                cbShowDrawingControl.Checked = GoogleManager1.DrawingControl;

                foreach (var item in DrawingOverlayType.Values)
                {
                    var li = new ListItem(item);
                    li.Selected = GoogleManager1.DrawingControlOptions.DrawingModes.Contains(item);
                    cblDrawingModes.Items.Add(li);
                }
            }
            else
            {
                GoogleManager1.DrawingControl = cbShowDrawingControl.Checked;
                GoogleManager1.DrawingMode = ddlDrawingMode.SelectedValue;
                GoogleManager1.DrawingControlOptions.Position = (ControlPosition)Enum.Parse(typeof(ControlPosition), ddlDrawingPositipon.SelectedValue);

                var modes = new List<DrawingOverlayType>();
                foreach(ListItem item in cblDrawingModes.Items)
                {
                    if(item.Selected)
                    {
                        modes.Add(item.Value);
                    }
                }
                GoogleManager1.DrawingControlOptions.DrawingModes = modes.ToArray();
            }
        }

        protected override void OnPreRender(EventArgs e)
        {
            base.OnPreRender(e);
        }
    }
}