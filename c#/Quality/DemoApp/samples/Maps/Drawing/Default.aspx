<%@ Page Language="C#" MasterPageFile="../Maps.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Drawing.Default1" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Drawing Sample</h2>
        <p>A sample about ASP.NET Google Map Control drawing capabilities.</p>
    </div>
    <p>
        You can add map drawing capabilities to any GoogleMap control just by adding a DrawingManager extension targeting the control (see the source bellow). 
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8" Latitude="42.1229" Longitude="24.7879" CssClass="map" DefaultAddress="sofia"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:DrawingManager ID="GoogleManager1" TargetControlID="GoogleMap1" runat="server">
        </map:DrawingManager>
        <%--OnOverlayComplete="GoogleManager1_OverlayComplete"--%>
        <div style="text-align: center; padding-top: 10px; color: blue;">
            <asp:Label ID="lblInfo" runat="server"></asp:Label>
        </div>
    </div>

    <h3>DrawingManager Options</h3>
    <p>
        The DrawingManager extends GoogleMap Control with Google Maps Drawing Library.  
        It provides set of options that define the set of controls to display, the position of the control, and the initial drawing state.
    </p>
    <ul>
        <li>The DrawingMode property of the DrawingManager defines the initial drawing state of the DrawingManager. Default is null, in which case the cursor is in a non-drawing mode when the DrawingManager is initialized.</li>
        <li>The DrawingControl property of the DrawingManager defines the visibility of the drawing tools selection interface on the map. It accepts a boolean value. </li>
        <li>You can also define the position of the control, and the types of overlays that should be represented in the control, using the DrawingControlOptions property of the DrawingManager.
            <ul>
                <li>Position defines the position of the drawing control on the map.</li>
                <li>DrawingModes is an array of GoogleMaps.Drawing.OverlayType constants, and defines the overlay types to include in the drawing control shape picker. The hand icon will always be present, allowing the user to interact with the map without drawing. The order of the tools in the control will match the order in which they are declared in the array.</li>
            </ul>
        </li>
    </ul>
    <h3>DrawingManager Events</h3>
    <p>
        Here is the list of map drawing events you can handle client and server side.
    </p>
    <ul>
        <li>OverlayComplete - This event is fired when drawing any overlay is complete.</li>
        <li>CircleComplete - This event is fired when drawing circle is complete.</li>
        <li>MarkerComplete - This event is fired when drawing marker is complete.</li>
        <li>PolygonComplete - This event is fired when drawing polygon is complete.</li>
        <li>PolylineComplete - This event is fired when drawing polyline is complete.</li>
        <li>RectangleComplete - This event is fired when drawing rectangle is complete.</li>
    </ul>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
