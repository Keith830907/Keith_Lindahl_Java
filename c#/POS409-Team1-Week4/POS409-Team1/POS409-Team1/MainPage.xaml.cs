using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace POS409_Team1
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        MainPageViewModel ViewModel { get; set; }
        public MainPage()
        {
            this.InitializeComponent();
            ViewModel = new MainPageViewModel(new GetTestData(), null, null);
        }
        private void btnGetDirections_Click(object sender, RoutedEventArgs e)
        {
            
            //IMapsProvider mapsProvider = new GetTestData();
            //var data = mapsProvider.GetDirections(txtStartAddress.Text, txtEndAddress.Text);
            //txtStartAddress.Text = data.routes[0].legs[0].start_address;
            //txtEndAddress.Text = data.routes[0].legs.Last().end_address;
            ////gvLegs.DataSource = data.routes[0].legs.Select(l=>l.steps);
            //txtTotalDistance.Text = data.routes[0].legs.Sum(l => l.distance.value).ToString();
            //txtTotalTime.Text = data.routes[0].legs.Sum(l => l.duration.value).ToString();

            //List<GoogleMaps.Step> allSteps = new List<GoogleMaps.Step>();
            //foreach (var leg in data.routes[0].legs)
            //    allSteps.AddRange(leg.steps);
            //DirectionSteps = new ObservableCollection<GoogleMaps.Step>(allSteps);
            ////gvLegs.DataSource = allSteps;
        }
    }
}
