<%@ Page Title="" Language="C#" MasterPageFile="Maps.master" AutoEventWireup="true" 
    CodeBehind="StreetViewPanorama.aspx.cs" Inherits="GoogleMaps.Samples.Maps.StreetViewPanorama" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h1>
        Map Street View Panorama
    </h1>
    <p>
        GoogleMap control street view panorama sample.
    </p>
    <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.345573" Longitude="-71.098326" Zoom="14"
        Width="100%" Height="600px" FullscreenControl="true">
    </map:GoogleMap>
    <map:GoogleStreetViewPanorama runat="server" TargetControlID="GoogleMap1" />
</asp:Content>
