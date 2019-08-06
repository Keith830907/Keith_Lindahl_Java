<%@ Page Language="C#" MasterPageFile="Overlays.master" AutoEventWireup="false" %>

<asp:Content ID="mainContent" ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Polygon Overlay Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control polygon overlay usage.
        </p>
    </div>
    <p>
        A demo about how simple(in markup) is to add a polygon to ASP.NET Google Map Control.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229"
            Longitude="24.7879" Zoom="4" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GooglePolygon TargetControlID="GoogleMap1" runat="server" Draggable="true" Editable="true">
            <map:LatLng Latitude="37.97918" Longitude="23.716647" />
            <map:LatLng Latitude="41.036501" Longitude="28.984895" />
            <map:LatLng Latitude="44.447924" Longitude="26.097879" />
            <map:LatLng Latitude="44.802416" Longitude="20.465601" />
            <map:LatLng Latitude="42.002411" Longitude="21.436097" />
            <map:LatLng Latitude="37.97918" Longitude="23.716647" />
        </map:GooglePolygon>
    </div>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
