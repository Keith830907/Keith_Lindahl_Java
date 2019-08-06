<%@ Page Language="C#" MasterPageFile="~/samples/Overlays/Overlays.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Overlays.ServerEvents.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Polygon Server Events Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control overlay server events.
        </p>
    </div>
    <p>
        The polygon fires next events: click, double click, mouse down, mouse move, mouse
        out, mouse over, mouse up, right click.<br />
        The event fired by the polyline will be listed in the info list bellow (most recent
        first).
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229"
            Longitude="24.7879" Zoom="6" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GooglePolygon TargetControlID="GoogleMap1" runat="server" OnClick="HandleClick" Draggable="true" Editable="true">
            <%--
                TODO: Add some of those bellow to test them:
                OnDoubleClick="HandleDoubleClick"
                OnMouseDown="HandleMouseDown" 
                OnMouseOut="HandleMouseOut" 
                OnMouseOver="HandleMouseOver"
                OnMouseUp="HandleMouseUp" 
                OnRightClick="HandleRightClick"
            --%>
            <map:LatLng Latitude="37.97918" Longitude="23.716647" />
            <map:LatLng Latitude="41.036501" Longitude="28.984895" />
            <map:LatLng Latitude="44.447924" Longitude="26.097879" />
            <map:LatLng Latitude="44.802416" Longitude="20.465601" />
            <map:LatLng Latitude="42.002411" Longitude="21.436097" />
            <map:LatLng Latitude="37.97918" Longitude="23.716647" />
        </map:GooglePolygon>
    </div>
    <div>
        Events (most recent first):
        <asp:Button runat="server" Text="Clear" OnClick="HandleClearClick" />
    </div>
    <asp:ListBox ID="lbEvents" runat="server" Rows="20" Width="100%"></asp:ListBox>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
