<%@ Page Language="C#" MasterPageFile="Markers.master" AutoEventWireup="true" CodeBehind="FitBounds.aspx.cs" Inherits="GoogleMaps.Samples.Markers.FitBounds" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="server">
    <h2>Fit to Bounds</h2>
    <p>
        A sample of fit map to markers' bounds. Just refresh the page to get different random markers and bound.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="8" EnableScrollWheelZoom="true" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server" FitBounds="true">
        </map:GoogleMarkers>
    </div>
    <asp:Button runat="server" Text="Submit" />
</asp:Content>
