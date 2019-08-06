using POS409_Team1.GoogleMaps;
using System;
using System.Linq;
using System.Xml.Linq;

namespace POS409_Team1
{
    public class GetTestData : IMapsProvider
    {
        public DirectionsResponse GetDirections(string beginningPoint, string endingPoint)
        {
            var rootDocument = XDocument.Load("Route.xml");

            var response = new DirectionsResponse();

            response.geocoded_waypoints = (from _wayPoints in rootDocument.Element("DirectionsResponse").Elements("geocoded_waypoint")
                                           select new GeocodedWaypoint
                                           {
                                               geocoder_status = _wayPoints.Element("geocoder_status").Value,
                                               place_id = _wayPoints.Element("place_id").Value
                                           }).ToList();
            response.status = rootDocument.Element("DirectionsResponse").Element("status").Value;

            response.routes = (from _routes in rootDocument.Element("DirectionsResponse").Element("routes").Elements("route")
                               select new Route
                               {
                                   summary = _routes.Element("summary").Value,
                                   legs = (from _legs in _routes.Element("legs").Elements("leg")
                                           select new Leg
                                           {
                                               distance = (from _distance in _legs.Elements("distance")
                                                           select new Distance
                                                           {
                                                               text = _distance.Element("text").Value,
                                                               value = Convert.ToInt32(_distance.Element("value").Value)
                                                           }).FirstOrDefault(),
                                               duration = (from _duration in _legs.Elements("duration")
                                                           select new Duration
                                                           {
                                                               text = _duration.Element("text").Value,
                                                               value = Convert.ToInt32(_duration.Element("value").Value)
                                                           }).FirstOrDefault(),
                                               end_address = _legs.Element("end_address").Value,
                                               end_location = (from _location in _legs.Elements("end_location")
                                                               select new MapPoint
                                                               {
                                                                   lat = Convert.ToDouble(_location.Element("lat").Value),
                                                                   lng = Convert.ToDouble(_location.Element("lng").Value)
                                                               }).FirstOrDefault(),
                                               start_address = _legs.Element("start_address").Value,
                                               start_location = (from _location in _legs.Elements("start_location")
                                                                 select new MapPoint
                                                                 {
                                                                     lat = Convert.ToDouble(_location.Element("lat").Value),
                                                                     lng = Convert.ToDouble(_location.Element("lng").Value)
                                                                 }).FirstOrDefault(),
                                               steps = (from _steps in _legs.Elements("step")
                                                        select new Step
                                                        {
                                                            distance = (from _distance in _legs.Elements("distance")
                                                                        select new Distance
                                                                        {
                                                                            text = _distance.Element("text").Value,
                                                                            value = Convert.ToInt32(_distance.Element("value").Value)
                                                                        }).FirstOrDefault(),
                                                            duration = (from _duration in _legs.Elements("duration")
                                                                        select new Duration
                                                                        {
                                                                            text = _duration.Element("text").Value,
                                                                            value = Convert.ToInt32(_duration.Element("value").Value)
                                                                        }).FirstOrDefault(),
                                                            end_location = (from _location in _legs.Elements("end_location")
                                                                            select new MapPoint
                                                                            {
                                                                                lat = Convert.ToDouble(_location.Element("lat").Value),
                                                                                lng = Convert.ToDouble(_location.Element("lng").Value)
                                                                            }).FirstOrDefault(),
                                                            start_location = (from _location in _legs.Elements("start_location")
                                                                              select new MapPoint
                                                                              {
                                                                                  lat = Convert.ToDouble(_location.Element("lat").Value),
                                                                                  lng = Convert.ToDouble(_location.Element("lng").Value)
                                                                              }).FirstOrDefault(),
                                                            html_instructions = _steps.Element("html_instructions").Value,
                                                            travel_mode = _steps.Element("travel_mode").Value,
                                                            maneuver=_steps.Element("maneuver")?.Value
                                                        }).ToList()
                                           }).ToList()
                               }).ToList();

            return response;

            //var serializer = new XmlSerializer(typeof(DirectionsResponse));
            //using (var fileStream = new System.IO.StreamReader("Route.xml"))
            //{
            //    var response = (DirectionsResponse)serializer.Deserialize(fileStream);
            //    return response;
            //}

            //var rootObject = new DirectionsResponse();
            //rootObject.geocoded_waypoints = new List<GeocodedWaypoint>();
            //rootObject.routes = new List<Route>();
            //rootObject.status = "OK";

            //var route = new Route();
            //route.summary = "I-55 S and I-44";
            //route.copyrights = "Map data ©2019 Google, INEGI";
            //route.legs = new List<Leg>();
            //route.legs.Add(new Leg()
            //{
            //    distance = new Distance()
            //    {
            //        text = "1721 mi",
            //        value = 1721
            //    },
            //    duration = new Duration()
            //    {
            //        value = 1620,
            //        text = "1 day 3 hr"
            //    },
            //    end_address = "University of Phoenix,9520 W Palm Ln,Phoenix,AZ 85037, USA",
            //    start_address = "Chicago, IL, USA",
            //    start_location = new MapPoint()
            //    {
            //        lat = 41.8757043,
            //        lng = -87.763599
            //    },
            //    end_location = new MapPoint()
            //    {
            //        lat = 34.226039,
            //        lng = -112.285083
            //    },
            //    steps=new List<Step>()
            //});
            //rootObject.routes.Add(route);
            //return rootObject;
        }
    }
}
