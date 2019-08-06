using System;
using GoogleMaps.Samples.Data.Sources;

namespace GoogleMaps.Samples.samples.Maps.Visualization.Heatmap
{
    public partial class Default : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            // you can directly seed the raw data using Add and AddRange methods
            // in that case is not needed to invoke the DataBind method to perform binding
            Heatmap1.AddRange(HeatmapDataSource.GetRawData());

            // OR

            // you can bind the raw data to the DataSource property,
            // but you must invoke DataBind method to perform the binding, otherwise it won't work
            //Heatmap1.DataSource = HeatmapDataSource.GetRawData();
            //Heatmap1.DataBind();
        }
    }
}
