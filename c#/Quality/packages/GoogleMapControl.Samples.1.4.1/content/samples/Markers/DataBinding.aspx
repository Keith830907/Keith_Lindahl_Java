<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="DataBinding.aspx.cs" Inherits="GoogleMaps.Samples.Markers.DataBinding" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>
        Markers Data Binding
    </h2>
    <p>
        GoogleMap control markers data binding sample.
        <br />
        Drag or zoom the map to desired position and code will generate random markers (20
        by default) inside the current bounds of the map.<br />
        To change the number of rendered out markers enter the number in text box bellow.
    </p>
    <fieldset>
        <legend>Settings</legend>
        <label>
            Change markers' count</label>
        <asp:TextBox ID="txtCount" runat="server" OnTextChanged="HandleTextCountChanged"></asp:TextBox>
    </fieldset>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="4" EnableScrollWheelZoom="true" OnDragEnd="HandleMapEvent" OnZoomChanged="HandleMapEvent"
            CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server"
            DataSourceID="odsMarkers" DataLatitudeField="Lat" DataLongitudeField="Lng" DataInfoField="Info">
            <MarkerOptions Draggable="true">
            </MarkerOptions>
            <InfoWindowOptions DisableAutoPan="true" />
        </map:GoogleMarkers>
    </div>
    <asp:ObjectDataSource ID="odsMarkers" runat="server" TypeName="GoogleMaps.Samples.Data.SampleDataSource" 
        SelectMethod="GetTestMarkers" OnSelecting="HandleDataSelecting">
        <SelectParameters>
            <asp:Parameter Name="count" Type="Int32" DefaultValue="20" />
            <asp:Parameter Name="bounds" />
        </SelectParameters>
    </asp:ObjectDataSource>
</asp:Content>
