<%@ Page MasterPageFile="~/samples/Maps/Maps.master" Language="C#" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Maps.Visualization.Heatmap.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Heatmap Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control Heatmap Layer.
        </p>
    </div>
    <p>
        A heatmap is a visualization used to depict the intensity of data at geographical points. When the Heatmap Layer is enabled, a colored overlay will appear on top of the map. By default, areas of higher intensity will be colored red, and areas of lower intensity will appear green.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" CssClass="map" Latitude="37.775" Longitude="-122.434" Zoom="13"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>
    <map:HeatmapLayer ID="Heatmap1" runat="server" TargetControlID="GoogleMap1">
    </map:HeatmapLayer>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>

    <h3>Object Data Source</h3>
    <pre><code class="html"><%: SourceReader.Read(@"\Data\Sources\HeatmapDataSource.cs") %></code></pre>
    <%--//CODE--%>
</asp:Content>
