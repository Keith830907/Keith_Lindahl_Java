<%@ Page Language="C#" MasterPageFile="~/samples/Maps/Maps.master" AutoEventWireup="true" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Data-Bound Heatmap Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control Data-Bound Heatmap Layer.
        </p>
    </div>
    <p>
        This is a sample how you can bind heatmap layer to a DataSource control.<br />
        In the current sample we bind it to an ObjectDataSource,
        but in a similar way it can bound to SqlDataSource fetching the data from database for example.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" CssClass="map" Latitude="37.775" Longitude="-122.434" Zoom="13"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>
    <map:HeatmapLayer ID="Heatmap1" runat="server" TargetControlID="GoogleMap1"
        DataSourceID="HeatampDataSource1" DataLatitudeField="Lat" DataLongitudeField="Lng"></map:HeatmapLayer>
    <asp:ObjectDataSource ID="HeatampDataSource1" runat="server"
        TypeName="GoogleMaps.Samples.Data.Sources.HeatmapDataSource" SelectMethod="GetDataObjects"></asp:ObjectDataSource>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Object Data Source</h3>
    <pre><code class="html"><%: SourceReader.Read(@"\Data\Sources\HeatmapDataSource.cs") %></code></pre>
    <%--//CODE--%>
</asp:Content>
