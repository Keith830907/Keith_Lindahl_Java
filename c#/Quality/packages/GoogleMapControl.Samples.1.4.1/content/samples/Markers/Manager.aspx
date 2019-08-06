<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="Manager.aspx.cs" Inherits="GoogleMaps.Samples.Markers.Manager" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>Marker Manager</h2>
    <p>
        GoogleMap control markers grouping sample using marker manager.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="48.25" Longitude="11.00" Zoom="4"
            EnableScrollWheelZoom="true" CssClass="map" MapType="Roadmap" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="MarkersExtender" runat="server" TargetControlID="GoogleMap1">
            <MarkerManager />
        </map:GoogleMarkers>
    </div>
</asp:Content>
