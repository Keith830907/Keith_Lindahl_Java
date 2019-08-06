using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POS409_Team1
{
    public class MainPageViewModel
    {
        public ObservableCollection<GoogleMaps.Step> DirectionSteps { get; set; }
        public string StartAddress { get; set; }
        public string EndAddress { get; set; }
        public double TotalDistance { get; set; }
        public double TotalTime { get; set; }

        public MainPageViewModel(IMapsProvider mapsProvider, string startAddress, string endAddress)
        {
            var data = mapsProvider.GetDirections(startAddress, endAddress);
            StartAddress = data.routes[0].legs[0].start_address;
            EndAddress = data.routes[0].legs.Last().end_address;
            //gvLegs.DataSource = data.routes[0].legs.Select(l=>l.steps);
            TotalDistance = data.routes[0].legs.Sum(l => l.distance.value);
            TotalTime = data.routes[0].legs.Sum(l => l.duration.value);

            List<GoogleMaps.Step> allSteps = new List<GoogleMaps.Step>();
            foreach (var leg in data.routes[0].legs)
                allSteps.AddRange(leg.steps);
            DirectionSteps = new ObservableCollection<GoogleMaps.Step>(allSteps);

        }

        
    }
}
