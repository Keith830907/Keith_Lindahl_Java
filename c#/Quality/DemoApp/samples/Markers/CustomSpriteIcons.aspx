<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="Server">
    <h2>
        Markers Custom Sprite Icons
    </h2>
    <p>
        GoogleMap control markers' custom sprite icons sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="6" BorderStyle="Solid" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <%--
        NOTICE THE VARIOUS WAYS YOU CAN SET THE ICONS' PROPERTIES
        --%>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server">
            <Markers>
                <map:Marker Address="plovdiv" Title="Click on the marker" Info="Text of marker 1"
                    Icon-Url="/images/icons/sprites.gif" Icon-Size-Height="32" Icon-Size-Width="32">
                </map:Marker>
                <map:Marker Address="burgas" Title="Click on the marker" Info="Text of marker 2"
                    Icon-Url="/images/icons/sprites.gif" Icon-Origin-X="0" Icon-Origin-Y="32">
                    <Icon Size-Height="32" Size-Width="32"></Icon>
                </map:Marker>
                <map:Marker Position-Latitude="42.7" Position-Longitude="23.3" Title="Click on the marker"
                    Info="Text of marker 3">
                    <Icon Url="/images/icons/sprites.gif" Origin-X="32" Origin-Y="0" Size-Height="32" Size-Width="32">
                    </Icon>
                </map:Marker>
                <map:Marker Title="Click on the marker"
                    Info="Text of marker 4">
                    <Position Latitude="43.0" Longitude="24.0"/>
                    <Icon Url="/images/icons/sprites.gif" Origin-X="32" Origin-Y="32">
                        <Size Height="32" Width="32"/>
                        <Anchor X="16" Y="32" />
                    </Icon>
                </map:Marker>
            </Markers>
            <MarkerOptions Draggable="true">
            </MarkerOptions>
        </map:GoogleMarkers>
    </div>
</asp:Content>
