<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="Labels.aspx.cs" Inherits="GoogleMaps.Samples.Markers.Labels" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>Markers Labels
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
                <map:Marker Address="Plovdiv" LabelText="P">
                </map:Marker>
                <map:Marker Address="Sofia" LabelText="S">
                    <Label Color="#FFFFFF" FontSize="18px" FontWeight="bold" Text="S"/>
                </map:Marker>
            </Markers>
        </map:GoogleMarkers>
    </div>
</asp:Content>
