<%@ Page Language="C#" MasterPageFile="~/samples/Maps/Maps.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Maps.Visualization.Heatmap.Options.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Heatmap Options Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control Heatmap Layer options.
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
    <%--All the options can be set in code-behind (see the page source code)--%>
    <map:HeatmapLayer ID="Heatmap1" runat="server" TargetControlID="GoogleMap1"
        DataSourceID="HeatampDataSource1" DataLatitudeField="Lat" DataLongitudeField="Lng" MaxIntensity="0.5" Opacity="0.4" Radius="25">
        <Gradient>
            <map:CssColor Value="rgba(0, 255, 255, 0)" />
            <map:CssColor Value="rgba(0, 255, 255, 1)" />
            <map:CssColor Value="rgba(0, 191, 255, 1)" />
            <map:CssColor Value="rgba(0, 127, 255, 1)" />
            <map:CssColor Value="rgba(0, 63, 255, 1)" />
            <map:CssColor Value="rgba(0, 0, 255, 1)" />
            <map:CssColor Value="rgba(0, 0, 223, 1)" />
            <map:CssColor Value="rgba(0, 0, 191, 1)" />
            <map:CssColor Value="rgba(0, 0, 159, 1)" />
            <map:CssColor Value="rgba(0, 0, 127, 1)" />
            <map:CssColor Value="rgba(63, 0, 91, 1)" />
            <map:CssColor Value="rgba(127, 0, 63, 1)" />
            <map:CssColor Value="rgba(191, 0, 31, 1)" />
            <map:CssColor Value="rgba(255, 0, 0, 1)" />
        </Gradient>
    </map:HeatmapLayer>
    <asp:ObjectDataSource ID="HeatampDataSource1" runat="server"
        TypeName="GoogleMaps.Samples.Data.Sources.HeatmapDataSource" SelectMethod="GetDataObjects">
    </asp:ObjectDataSource>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>