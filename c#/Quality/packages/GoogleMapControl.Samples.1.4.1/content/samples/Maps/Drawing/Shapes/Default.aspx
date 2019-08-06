<%@ Page Language="C#" MasterPageFile="../../Maps.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Drawing.Shapes.Default" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Drawing Shapes Sample</h2>
        <p>A sample about ASP.NET Google Map Control shapes draw, persist and load.</p>
    </div>
    <p>
        The map will load from the database and show last 100 polygons persisted.<br />
        The shapes will be saved automatically. When you complete a polygon draw a server-side <b>OnPolygonComplete</b>
        will be fired and polygon is going to be saved in a database. Check out the source code bellow.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8" Latitude="42.1229" Longitude="24.7879" CssClass="map" DefaultAddress="sofia"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:DrawingManager ID="GoogleManager1" TargetControlID="GoogleMap1" runat="server" DrawingMode="Polygon" OnPolygonComplete="HandlePolygonComplete">
            <DrawingControlOptions DrawingModes="polygon" Position="TopLeft" />
        </map:DrawingManager>
    </div>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>

    <h3>Data Context</h3>
    <pre><code class="cs"><%= SourceReader.Read("/Data/DataContext.cs") %></code></pre>

    <h3>Shape Point Entity</h3>
    <pre><code class="cs"><%= SourceReader.Read("/Data/ShapePoint.cs") %></code></pre>

    <h3>Shape Entity</h3>
    <pre><code class="cs"><%= SourceReader.Read("/Data/Shape.cs") %></code></pre>
    <%--//CODE--%>
</asp:Content>
