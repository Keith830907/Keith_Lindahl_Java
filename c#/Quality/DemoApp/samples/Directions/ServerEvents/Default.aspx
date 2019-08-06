<%@ Page Language="C#" MasterPageFile="~/samples/Directions/Directions.master"  AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Directions.ServerEvents.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Directions Server Events Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control directions server events usage.
        </p>
    </div>
    <p>
        Shows how to handle on the server the events fired by Google Map Directions.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="4" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleDirections ID="GoogleDirections1" TargetControlID="GoogleMap1" runat="server"
            Origin="plovdiv" Destination="sofia" Draggable="true" PanelID="route" OnChanged="HandleDirectionsChanged">
        </map:GoogleDirections>
    </div>
    <asp:PlaceHolder ID="phRoutes" runat="server">
        <div id="route">
        </div>
    </asp:PlaceHolder>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>