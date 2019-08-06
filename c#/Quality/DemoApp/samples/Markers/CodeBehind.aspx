<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="CodeBehind.aspx.cs" Inherits="GoogleMaps.Samples.Markers.CodeBehind" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>
        Markers Code Behind
    </h2>
    <p>
        GoogleMap control markers code behind sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="6" EnableScrollWheelZoom="true" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>
</asp:Content>
