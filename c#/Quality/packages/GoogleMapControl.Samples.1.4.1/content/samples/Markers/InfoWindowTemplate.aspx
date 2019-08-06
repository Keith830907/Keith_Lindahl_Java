<%@ Page Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="Server">
    <h2>Advanced Info Window
    </h2>
    <p>
        GoogleMap control markers advanced info window sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879" Zoom="6" EnableScrollWheelZoom="true" CssClass="map"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server">
            <Markers>
                <map:Marker Address="plovdiv" Title="Click on the marker" Info="Another test">
                    <InfoWindowContent>
                        <iframe src="http://googlemapcontrol.com/"></iframe>
                    </InfoWindowContent>
                </map:Marker>
                <map:Marker Position-Latitude="42.7" Position-Longitude="23.3" Title="Click on the marker" Info="This is a test">
                    <InfoWindowContent>
                        <h1>This is a tets</h1>
                        <input />
                        <button>Test</button>
                    </InfoWindowContent>
                </map:Marker>
            </Markers>
            <MarkerOptions Draggable="true"></MarkerOptions>
        </map:GoogleMarkers>
    </div>
</asp:Content>
