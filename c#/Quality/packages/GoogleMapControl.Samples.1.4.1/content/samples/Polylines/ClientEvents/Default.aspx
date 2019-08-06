<%@ Page Language="C#" MasterPageFile="../Polylines.master" AutoEventWireup="false" %>

<asp:Content ID="mainContent" ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Polyline Client Events Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control polyline client events usage.
        </p>
    </div>
    <p>
        The polyline fires next events: click, double click, mouse down, mouse move, mouse
        out, mouse over, mouse up, right click.<br />
        The event fired by the polyline will be listed in the info list bellow (most recent
        first).
    </p>
    <p>
        For full api documentation about polylines <a href="/docs/html/b578ec4c-f53c-8d36-97b4-da5ec68eac02.htm" target="_blank">read here ...</a>
    </p>

    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229"
            Longitude="24.7879" Zoom="7" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GooglePolyline ID="GooglePolyline1" TargetControlID="GoogleMap1" runat="server"
            StrokeWeight="10" Clickable="true" OnClientClick="handleClick" OnClientDoubleClick="handleDoubleClick"
            OnClientMouseDown="handleMouseDown" OnClientMouseOut="handleMouseOut" OnClientMouseOver="handleMouseOver"
            OnClientMouseUp="handleMouseUp" OnClientRightClick="handleRightClick" Draggable="true" Editable="true">
            <map:LatLng Latitude="42.14304" Longitude="24.74967" />
            <map:LatLng Latitude="42.69649" Longitude="23.32601" />
        </map:GooglePolyline>
    </div>
    <div>
        Events (most recent first):
        <input type="button" value="Clear" onclick="handleClearClick()" />
    </div>
    <select id="list" multiple="multiple" size="20" style="width: 100%;">
    </select>
    <script type="text/javascript">
        var list = document.getElementById("list");

        function handleClearClick() {
            $("#list").empty();
        }

        function handleClick(sender, e) {
            printEvent("Click", e);
        }
        function handleDoubleClick(sender, e) {
            printEvent("Double Click", e);
        }
        function handleMouseDown(sender, e) {
            printEvent("Mouse Down", e);
        }
        function handleMouseMove(sender, e) {
            printEvent("Mouse Move", e);
        }
        function handleMouseOut(sender, e) {
            printEvent("Mouse Out", e);
        }
        function handleMouseOver(sender, e) {
            printEvent("Mouse Over", e);
        }
        function handleMouseUp(sender, e) {
            printEvent("Mouse Up", e);
        }
        function handleRightClick(sender, e) {
            printEvent("Right Click", e);
        }

        function printEvent(name, e) {

            var buffer = [];
            buffer.push(name);
            buffer.push(" event was fired");
            if (e && e.latLng) {
                buffer.push(" (lat: ");
                buffer.push(e.latLng.lat());
                buffer.push(", lng: ");
                buffer.push(e.latLng.lng());
                buffer.push(")");
            }
            buffer.push(".");

            var option = document.createElement("option");
            option.text = buffer.join('');

            if (list.childNodes.length > 0) {
                list.insertBefore(option, list.childNodes[0]);
            }
            else {
                list.appendChild(option);
            }
            // print it out in the browser console as well, if provided
            if (console) console.dir(e);
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
