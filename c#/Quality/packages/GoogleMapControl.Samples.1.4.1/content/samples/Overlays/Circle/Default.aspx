<%@ Page Language="C#" MasterPageFile="../Overlays.master" AutoEventWireup="false" %>

<asp:Content ID="Content2" runat="server" ContentPlaceHolderID="MainContent">
    <div class="jumbotron">
        <h2>Circle Overlay Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control circle overlay usage.
        </p>
    </div>
    <p>
        A demo about how simple(in markup) is to add a circle overlay to ASP.NET Google Map Control.
    </p>
    <p>
        Events can be handled same way as the overlays events.
        Check out <a href="ClientEvents.aspx">client</a> and <a href="ServerEvents.aspx">server</a>
        polygon events handling.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229"
            Longitude="24.7879" Zoom="6" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleCircle TargetControlID="GoogleMap1" runat="server" Center="42.1229,24.7879"
            Radius="200000" Draggable="true" Editable="true" />
    </div>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
