<%@ Page Language="C#" MasterPageFile="../Overlays.master" AutoEventWireup="false" %>

<asp:Content ID="Content2" runat="server" ContentPlaceHolderID="MainContent">
    <div class="jumbotron">
        <h2>Ground Overlay Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control ground overlay usage.
        </p>
    </div>
    <p>
        A demo about how simple(in markup) is to add a ground overlay to ASP.NET Google Map Control.
    </p>
    <p>
        Events can be handled same way as the polygon events.
        Check out <a href="ClientEvents.aspx">client</a> and <a href="ServerEvents.aspx">server</a>
        polygon events handling.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="Roadmap" CssClass="map" Width="100%"
            Latitude="40.740" Longitude="-74.18" Zoom="13" MapTypeControlOptions-Position="BottomRight" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleGround TargetControlID="GoogleMap1" runat="server" Bounds-SouthWest-Latitude="40.716216"
            Bounds-SouthWest-Longitude="-74.213393" Bounds-NorthEast-Latitude="40.765641"
            Bounds-NorthEast-Longitude="-74.139235" Clickable="true" Url="http://www.lib.utexas.edu/maps/historical/newark_nj_1922.jpg"
            OnClientClick="handleClick" />
    </div>
    <script type="text/javascript">
        function handleClick() {
            alert("Ground Overlay click event was fired!");
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
