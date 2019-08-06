<%@ Page Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" %>

<asp:Content ID="mainContent" ContentPlaceHolderID="MainContent" runat="Server">
    <h2>
        Markers Custom Icons
    </h2>
    <p>
        GoogleMap control markers' custom icons sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="6" BorderStyle="Solid" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server">
            <Markers>
                <map:Marker Address="plovdiv" Title="Click on the marker" Info="Text of marker 1"
                    Icon-Url="/images/icons/sun.png" Shadow-Url="/images/icons/sun-shadow.png">
                </map:Marker>
                <map:Marker Position-Latitude="42.7" Position-Longitude="23.3" Title="Click on the marker"
                    Info="Text of marker 2">
                    <Icon Url="/images/icons/rain.png"></Icon>
                    <Shadow Url="/images/icons/rain-shadow.png"></Shadow>
                </map:Marker>
            </Markers>
            <MarkerOptions Draggable="true">
            </MarkerOptions>
        </map:GoogleMarkers>
    </div>
</asp:Content>
