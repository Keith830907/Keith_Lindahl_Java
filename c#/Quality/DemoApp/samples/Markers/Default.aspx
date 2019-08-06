<%@ Page Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Markers Sample</h2>
        <p>A sample about ASP.NET Google Map Control markers.</p>
    </div>
    <p>
        A sample to show some simple markers usage and how easy is to add them on map (see the source bellow).
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="6" EnableScrollWheelZoom="true" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server"
            OnClientClick="handleMarkerClick">
            <Markers>
                <map:Marker Address="plovdiv" Title="Click on the marker" Info="Text of marker 1" AutoOpen="true">
                </map:Marker>
                <map:Marker Position-Latitude="42.7" Position-Longitude="23.3" Title="Click on the marker"
                    Info="Text of marker 2" AutoOpen="true">
                </map:Marker>
            </Markers>
            <MarkerOptions Draggable="true">
            </MarkerOptions>
        </map:GoogleMarkers>
    </div>
    <script type="text/javascript">
        function handleMarkerClick(sender, e) {
            alert("Marker #" + (e.index + 1) + "\nPosition: lat=" + e.latLng.lat() + "/lng=" + e.latLng.lng() +
                "\nPixel: x=" + e.pixel.x + "/y=" + e.pixel.y);
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
