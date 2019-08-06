<%@ Page Language="C#" MasterPageFile="../Maps.master" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Events.Default" %>

<asp:Content runat="server" ID="mainContent" ContentPlaceHolderID="MainContent">
    <div class="jumbotron">
        <h2>Map Events Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control map events and how to handle them on the client or server.
        </p>
    </div>
    <p>
        The map fire next events: bounds changed, center changed, click, double click, drag,
        drag end, drag start, heading changed, idle, map type changed, mouse move, mouse
        out, mouse over, projection changed, resize, right click, tiles loaded, tilt changed,
        zoom changed.
    </p>
    <p>
        Use the event options bellow to set handlers for different map events and test them.<br />
        The event fired by the map will be listed in the info list bellow (most recent first).
    </p>
    <p>
        Be careful when adding server side handlers to BoundsChanged, HeadingChanged, ProjectionChanged and TilesLoaded.<br />
        Those events are fired on map loaded and adding them always will cause an infinite post-back loop, like in the sample here.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Zoom="6" CssClass="map" DefaultAddress="Hjo, Sweden"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>
    <p>
        Events (most recent first):
        <input type="button" value="Clear" onclick="handleClearClick()" class="btn btn-basic" />
    </p>
    <asp:ListBox ID="lbEventsList" runat="server" Width="100%" Rows="10" ClientIDMode="Static"></asp:ListBox>
    <asp:FormView ID="fvEvents" runat="server" DefaultMode="Edit" ItemType="GoogleMaps.Samples.Maps.Events.MapEventsModel" SelectMethod="GetMapEventsModel" UpdateMethod="UpdateMapEventsModel" Width="100%">
        <EditItemTemplate>
            <h3>Events</h3>
            <p>
                Here is the list of map events you can handle client and server side.
            </p>
            <ul>
                <li>Click - This event is fired when the user clicks on the map (but not when they click on a marker or infowindow).
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleClickOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleClickOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>DoubleClick - This event is fired when the user double-clicks on the map. Note that the click event will also fire, right before this one.
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleDoubleClickOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleDoubleClickOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>RightClick - This event is fired when the DOM contextmenu event is fired on the map container.
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleRightClickOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleRightClickOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>BoundsChanged - This event is fired when the viewport bounds have changed.
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleBoundsChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleBoundsChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>CenterChanged - This event is fired when the map center property changes.
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleCenterChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleCenterChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>Drag
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleDragOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleDragOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>DragStart
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleDragStartOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleDragStartOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>DragEnd
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleDragEndOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleDragEndOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>HeadingChanged
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleHeadingChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleHeadingChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>Idle
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleIdleOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleIdleOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>MapTypeChanged
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleMapTypeChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleMapTypeChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>MouseMove
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleMouseMoveOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleMouseMoveOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>MouseOut
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleMouseOutOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleMouseOutOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>MouseOver
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleMouseOverOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleMouseOverOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>ProjectionChanged
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleProjectionChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleProjectionChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>Resize
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleResizeOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleResizeOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>TilesLoaded
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleTilesLoadedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleTilesLoadedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
                <li>TiltChanged
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleTiltChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleTiltChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>

                <li>ZoomChanged
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="HandleZoomChangedOnClient" Mode="Edit" runat="server" />
                            Client Side Handler
                        </li>
                        <li>
                            <asp:DynamicControl DataField="HandleZoomChangedOnServer" Mode="Edit" runat="server" />
                            Server Side Handler
                        </li>
                    </ul>
                </li>
            </ul>
            <div style="text-align: center">
                <asp:Button runat="server" Text="Apply" CommandName="Update" CssClass="btn btn-primary" />
            </div>
        </EditItemTemplate>
    </asp:FormView>
    <script type="text/javascript">
        "use strict";

        var list = document.getElementById("lbEventsList");

        function handleClearClick() {
            $("#lbEventsList").empty();
        }

        function handleBoundsChanged(sender, e) {
            debugger;
            printEvent("Bounds Changed", sender, e);
        }
        function handleCenterChanged(sender, e) {
            debugger;
            printEvent("Center Changed", sender, e);
        }
        function handleClick(sender, e) {
            debugger;
            printEvent("Click", sender, e);
        }
        function handleDoubleClick(sender, e) {
            debugger;
            printEvent("Double Click", sender, e);
        }
        function handleDrag(sender, e) {
            debugger;
            printEvent("Drag", sender, e);
        }
        function handleDragEnd(sender, e) {
            debugger;
            printEvent("Drag End", sender, e);
        }
        function handleDragStart(sender, e) {
            debugger;
            printEvent("Drag Start", sender, e);
        }
        function handleHeadingChanged(sender, e) {
            debugger;
            printEvent("Heading Changed", sender, e);
        }
        function handleMapTypeChanged(sender, e) {
            debugger;
            printEvent("Map Type Changed", sender, e);
        }
        function handleMouseMove(sender, e) {
            debugger;
            printEvent("Mouse Move", sender, e);
        }
        function handleMouseOut(sender, e) {
            debugger;
            printEvent("Mouse Out", sender, e);
        }
        function handleMouseOver(sender, e) {
            debugger;
            printEvent("Mouse Over", sender, e);
        }
        function handleProjectionChanged(sender, e) {
            debugger;
            printEvent("Projection Changed", sender, e);
        }
        function handleResize(sender, e) {
            debugger;
            printEvent("Resize", sender, e);
        }
        function handleRightClick(sender, e) {
            debugger;
            printEvent("Right Click", sender, e);
        }
        function handleTilesLoaded(sender, e) {
            debugger;
            printEvent("Tiles Loaded", sender, e);
        }
        function handleTiltChanged(sender, e) {
            debugger;
            printEvent("Tilt Changed", sender, e);
        }
        function handleZoomChanged(sender, e) {
            debugger;
            printEvent("Zoom Changed", sender, e);
        }

        function printEvent(name, sender, e) {

            var buffer = [];
            buffer.push("[Client] ");
            buffer.push(name);
            buffer.push(" was fired");
            if (e) {
                if (e.latLng) {
                    buffer.push(" at position [lat: ");
                    buffer.push(e.latLng.lat());
                    buffer.push(", lng: ");
                    buffer.push(e.latLng.lng());
                    buffer.push("]");
                }
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
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>

    <h3>Model</h3>
    <pre><code class="cs"><%= SourceReader.ReadFile("MapEventsModel.cs") %></code></pre>
    <%--//CODE--%>
</asp:Content>
