<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="LabeledMarkers.aspx.cs" Inherits="GoogleMaps.Samples.Markers.LabeledMarkers" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>Labeled Markers
    </h2>
    <p>
        GoogleMap control markers' labels sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879" Zoom="8" EnableScrollWheelZoom="true" CssClass="map"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server">
            <Markers>
                <map:LabeledMarker Address="Sofia" LabelContent="#test" Draggable="true" LabelClass="labels">
                    <LabelAnchor X="35" Y="0" />
                </map:LabeledMarker>
                <map:LabeledMarker Address="Plovdiv" LabelContent="Simple Text" Info="this is test" LabelClass="labels" Draggable="true">
                    <LabelAnchor X="35" Y="0" />
                </map:LabeledMarker>
            </Markers>
        </map:GoogleMarkers>
    </div>
    <div id="test">
        DOM Content <br />
        <img src="/images/rabbit.jpg" />
    </div>

    <h3>Source</h3>

<pre><code class='aspnet'><%= HttpUtility.HtmlEncode(@"<div class='map-wrap'>
    <map:GoogleMap ID='GoogleMap1' runat='server' Latitude='42.1229' Longitude='24.7879' Zoom='8' EnableScrollWheelZoom='true' CssClass='map'>
    </map:GoogleMap>
    <map:GoogleMarkers ID='GoogleMarkers1' TargetControlID='GoogleMap1' runat='server'>
        <Markers>
            <map:LabeledMarker Address='Sofia' LabelContent='#test' Draggable='true' LabelClass='labels'>
                <LabelAnchor X='35' Y='0' />
            </map:LabeledMarker>
            <map:LabeledMarker Address='Plovdiv' LabelContent='Simple Text' Info='this is test' LabelClass='labels' Draggable='true'>
                <LabelAnchor X='35' Y='0' />
            </map:LabeledMarker>
        </Markers>
    </map:GoogleMarkers>
</div>
<div id='test'>
    DOM Content <br />
    <img src='/images/rabbit.jpg' />
</div>")%></code></pre>
</asp:Content>
