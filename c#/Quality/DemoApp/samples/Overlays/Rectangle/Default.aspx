<%@ Page Language="C#" MasterPageFile="../Overlays.master" AutoEventWireup="false" %>

<asp:Content ID="Content2" runat="server" ContentPlaceHolderID="MainContent">
    <div class="jumbotron">
        <h2>Rectangle Overlay Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control rectangle overlay usage.
        </p>
    </div>
    <p>
        A demo about how simple(in markup) is to add a rectangle overlay to ASP.NET Google Map Control.
    </p>
    <p>
        Events can be handled same way as the polygon events.
        Check out <a href="ClientEvents.aspx">client</a> and <a href="ServerEvents.aspx">server</a>
        polygon events handling.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229"
            Longitude="24.7879" Zoom="6" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleRectangle TargetControlID="GoogleMap1" runat="server" FillColor="Green"
            Bounds-SouthWest="44.802416,20.465601" Bounds-NorthEast="37.97918,23.716647" Draggable="true" Editable="true">
        </map:GoogleRectangle>
    </div>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
