<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="Clusterer.aspx.cs" Inherits="GoogleMaps.Samples.Markers.Clusterer" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>Marker Clusterer</h2>
    <p>
        GoogleMap control markers grouping sample using marker clusterer.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="37.4419" Longitude="-122.1419" Zoom="3"
            EnableScrollWheelZoom="true" CssClass="map" MapType="Roadmap" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="Markers1" runat="server" TargetControlID="GoogleMap1">
            <MarkerClusterer ImagePath="/images/markers/clusterer/m"/>
        </map:GoogleMarkers>
    </div>
</asp:Content>
