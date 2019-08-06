<%@ Page Language="C#" AutoEventWireup="false" MasterPageFile="../../Maps.master" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Drawing.MarkerOptions.Default" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Drawing Marker Options Sample</h2>
        <p>A sample about ASP.NET Google Map Control drawing marker options.</p>
    </div>
    <p>
        Set different values to options below the map and click on "Apply" to see the result.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8" Latitude="42.1229" Longitude="24.7879" CssClass="map"
            DefaultAddress="sofia" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:DrawingManager ID="GoogleManager1" TargetControlID="GoogleMap1" runat="server" DrawingMode="Marker">
            <DrawingControlOptions DrawingModes="Marker" Position="TopLeft" />
            <MarkerOptions Clickable="true" Draggable="true" Opacity="0.5" />
        </map:DrawingManager>
    </div>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
