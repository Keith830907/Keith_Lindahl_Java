using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POS409_Team1
{
    public interface IMapsProvider
    {
        POS409_Team1.GoogleMaps.DirectionsResponse GetDirections(string beginningPoint, string endingPoint);
    }
}
