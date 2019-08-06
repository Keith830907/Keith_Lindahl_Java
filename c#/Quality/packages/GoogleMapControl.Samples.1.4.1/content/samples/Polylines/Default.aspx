<%@ Page Language="C#" MasterPageFile="Polylines.master" AutoEventWireup="false" %>

<asp:Content ID="mainContent" ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Polyline Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control polyline usage.
        </p>
    </div>
    <p>
        A simple demo adding polyline to map and client handler for polyline click event.<br />
        For full api documentation about polylines <a href="https://mapcontrol.bitbucket.io/api/GoogleMaps.Polylines.GooglePolyline.html" target="_blank">read here ...</a>
    </p>

    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229" Longitude="24.7879" Zoom="7" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GooglePolyline TargetControlID="GoogleMap1" runat="server" StrokeWeight="10"
            OnClientClick="handleClick" Clickable="true" Geodesic="true" Draggable="true" Editable="true">
            <map:LatLng Latitude="42.14304" Longitude="24.74967" />
            <map:LatLng Latitude="42.69649" Longitude="23.32601" />
        </map:GooglePolyline>
    </div>

    <script type="text/javascript">
        function handleClick(sender, e) {
            alert("Polyline clicked at lat: " + e.latLng.lat() + ", lng: " + e.latLng.lng());
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
