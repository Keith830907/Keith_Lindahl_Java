using System;
using System.Collections.Generic;
using System.IO;
using GoogleMaps.Markers;
using Newtonsoft.Json;

namespace GoogleMaps.Samples.Markers
{
    public partial class Clusterer : System.Web.UI.Page
    {
        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            Markers1.Markers.AddRange(GetMarkers());
        }

        private IEnumerable<Marker> GetMarkers()
        {
            var json = File.ReadAllText(Server.MapPath("/app_data/data.json"));
            dynamic data = JsonConvert.DeserializeObject(json);

            foreach (dynamic photo in data.photos)
            {
                double lat = (double?)photo.latitude ?? 0;
                double lng = (double?)photo.longitude ?? 0;
                string info = string.Format("<img src='{0}' style='width: 240px;'/>", photo.photo_file_url);
                yield return new Marker { Position = new LatLng(lat, lng), Title = photo.title, Info = info };
            }
        }
    }
}