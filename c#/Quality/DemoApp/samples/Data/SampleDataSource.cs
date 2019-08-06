using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using GoogleMaps;

namespace GoogleMaps.Samples.Data
{
    [DataObject(true)]
    public static class SampleDataSource
    {
        [DataObjectMethod(DataObjectMethodType.Select)]
        public static GoogleMarkerData[] GetMarkersData()
        {
            return new GoogleMarkerData[] {
                new GoogleMarkerData("sofia bulgaria", "Here is Sofia."),
                new GoogleMarkerData("athens greece", "Here is Athens"),
                new GoogleMarkerData("plovdiv", "Here is Plovdiv")
            };
        }

        [DataObjectMethod(DataObjectMethodType.Select)]
        public static MapData GetMapData(long id)
        {
            if (id <= 0)
            {
                return new MapData {
                    Latitude = 42.1229,
                    Longitude =  24.7879,
                    MapType = MapType.Hybrid,
                    Zoom = 8
                };
            }
            using (var context = new DataContext())
            {
                return context.States
                    .Where(x => x.ID == id)
                    .Select(x => new MapData
                    {
                        Latitude = x.Latitude,
                        Longitude = x.Longitude,
                        MapType = (MapType)x.MapType,
                        Zoom = x.Zoom
                    })
                    .FirstOrDefault();
            }
        }

        [DataObjectMethod(DataObjectMethodType.Select)]
        public static IEnumerable<MarkerRecord> GetTestMarkers(int count, Bounds bounds)
        {

            if ((count > 0) && bounds != null)
            {
                var random = new Random();
                double lat, lng;
                double latSpan, lngSpan;

                for (var i = 0; i < count; i++)
                {
                    latSpan = bounds.NorthEast.Latitude - bounds.SouthWest.Latitude;
                    lngSpan = bounds.NorthEast.Longitude - bounds.SouthWest.Longitude;
                    lat = bounds.SouthWest.Latitude + (latSpan * random.NextDouble());
                    lng = bounds.SouthWest.Longitude + (lngSpan * random.NextDouble());
                    yield return new MarkerRecord { Lat = lat, Lng = lng, Info = "Marker #" + (i + 1) };
                }
            }
        }
    }

    public struct GoogleMarkerData
    {
        public GoogleMarkerData(string address, string description)
        {
            Address = address;
            Description = description;
        }

        public string Address { get; set; }

        public string Description { get; set; }
    }

    public class MarkerRecord
    {
        public string Info { get; set; }
        public double Lat { get; set; }
        public double Lng { get; set; }
    }

    public class MapData
    {
        public double Latitude { get; set; }

        public double Longitude { get; set; }

        public MapType MapType { get; set; }

        public int Zoom { get; set; }
    }
}
