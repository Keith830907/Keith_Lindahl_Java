<%@ Page Title="" Language="C#" MasterPageFile="Maps.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Map Options Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control set of available options.
        </p>
    </div>
    <p>
        Set different values to options below the map and click on "Apply" to see the result.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" CssClass="map" DefaultAddress="plovdiv" Zoom="5"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>

    <asp:FormView ID="fvOptions" runat="server" DefaultMode="Edit" ItemType="GoogleMaps.GoogleMap" SelectMethod="GetMap" UpdateMethod="UpdateMap" Width="100%">
        <EditItemTemplate>
            <h3>Options</h3>
            <p>
                Here is the list of map options you can test.
            </p>
            <ul>
                <li>
                    <asp:DynamicControl DataField="DefaultAddress" Mode="Edit" runat="server" />
                    <b>DefaultAddress</b> - The address to geocode and set as initial map center, when the provided Address is not valid or failed to geocode.
                </li>
                <li><b>Center</b> - The initial LatLng map center.
                    <ul>
                        <li>
                            <asp:DynamicControl DataField="Latitude" Mode="Edit" runat="server" />
                            <b>Latitude</b>
                        </li>
                        <li>
                            <asp:DynamicControl DataField="Longitude" Mode="Edit" runat="server" />
                            <b>Longitude</b>
                        </li>
                    </ul>
                </li>
                <li>
                    <asp:DynamicControl DataField="Address" Mode="Edit" runat="server" />
                    <b>Address</b> - The address to geocode and set the initial map center. 
                </li>
                <li>
                    <asp:DynamicControl DataField="DisableClear" Mode="Edit" runat="server" />
                    <b>DisableClear</b> - If true, do not clear the contents of the Map div.
                </li>
                <li>
                    <asp:DynamicControl DataField="DisableDefaultUI" Mode="Edit" runat="server" />
                    <b>DisableDefaultUI</b> - Enables/disables all default UI. May be overridden individually.
                </li>
                <li>
                    <asp:DynamicControl DataField="DisableDoubleClickZoom" Mode="Edit" runat="server" />
                    <b>DisableDoubleClickZoom</b> - Enables/disables zoom and center on double click. Enabled by default.
                </li>
                <li>
                    <asp:DynamicControl DataField="DisableKeyboardShortcuts" Mode="Edit" runat="server" />
                    <b>DisableKeyboardShortcuts</b> - If false, prevents the map from being controlled by the keyboard. Keyboard shortcuts are enabled by default.
                </li>
                <li>
                    <asp:DynamicControl DataField="Draggable" Mode="Edit" runat="server" />
                    <b>Draggable</b> - If false, prevents the map from being dragged. Dragging is enabled by default.
                </li>
                <li>
                    <asp:DynamicControl DataField="DraggableCursor" Mode="Edit" runat="server" />
                    <b>DraggableCursor</b> - The name or url of the cursor to display on a draggable object.
                </li>
                <li>
                    <asp:DynamicControl DataField="DraggingCursor" Mode="Edit" runat="server" />
                    <b>DraggingCursor</b> - The name or url of the cursor to display when an object is dragging.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableMapTypeControl" Mode="Edit" runat="server" />
                    <b>EnableMapTypeControl</b> - The initial enabled/disabled state of the Map type control. By default it is set to true and map type control is visible.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableOverviewMapControl" Mode="Edit" runat="server" />
                    <b>EnableOverviewMapControl</b> - The enabled/disabled state of the Overview Map control.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnablePanControl" Mode="Edit" runat="server" />
                    <b>EnablePanControl</b> - The enabled/disabled state of the Pan control.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableReverseGeocoding" Mode="Edit" runat="server" />
                    <b>EnableReverseGeocoding</b> - Gets or sets a value indicating whether reverse geocoding (address lookup) is enabled.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableRotateControl" Mode="Edit" runat="server" />
                    <b>EnableRotateControl</b> - The enabled/disabled state of the Rotate control.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableScaleControl" Mode="Edit" runat="server" />
                    <b>EnableScaleControl</b> - The initial enabled/disabled state of the Scale control.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableScrollWheelZoom" Mode="Edit" runat="server" />
                    <b>EnableScrollWheelZoom</b> - If false, disables scrollwheel zooming on the map. The scrollwheel is enabled by default.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableSearchBoxControl" Mode="Edit" runat="server" />
                    <b>EnableSearchBoxControl</b> - The enabled/disabled state of the search box control.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableStreetViewControl" Mode="Edit" runat="server" />
                    <b>EnableStreetViewControl</b> - The initial enabled/disabled state of the Street View Pegman control.
                </li>
                <li>
                    <asp:DynamicControl DataField="EnableZoomControl" Mode="Edit" runat="server" />
                    <b>EnableZoomControl</b> - The enabled/disabled state of the Zoom control.
                </li>
                <li>
                    <asp:DynamicControl DataField="FullscreenControl" Mode="Edit" runat="server" />
                    <b>FullscreenControl</b> - Enables/disables the control that opens the map in fullscreen mode. 
                </li>
                <li>
                    <asp:DynamicControl DataField="Language" Mode="Edit" runat="server" />
                    <b>Language</b> - The Google Maps API uses the browser's preferred language setting when displaying textual information such as the names for controls, copyright notices, driving directions and labels on maps. 
                </li>
                <li>
                    <asp:DropDownList ID="ddlMapType" runat="server" SelectMethod="GetMapTypes" SelectedValue="<%# GoogleMap1.MapType    %>">
                    </asp:DropDownList>
                    <b>MapType</b> - The initial Map mapTypeId. Required. You must specifically set an initial map type to see appropriate tiles.
                </li>
                <li>
                    <asp:DynamicControl DataField="MaxZoom" Mode="Edit" runat="server" />
                    <b>MaxZoom</b> - The maximum zoom level which will be displayed on the map.
                </li>
                <li>
                    <asp:DynamicControl DataField="MinZoom" Mode="Edit" runat="server" />
                    <b>MinZoom</b> - The minimum zoom level which will be displayed on the map.
                </li>
                <li>
                    <asp:DynamicControl DataField="Region" Mode="Edit" runat="server" />
                    <b>Region</b> - The Maps API serves map tiles and biases application behavior, by default, using the country of the host domain from which the API is loaded (which is the USA for maps.google.com).
                </li>
                <li>
                    <asp:DynamicControl DataField="ShowTraffic" Mode="Edit" runat="server" />
                    <b>ShowTraffic</b> - Gets or sets a value indicating whether [show traffic].
                </li>
                <li>
                    <asp:DynamicControl DataField="StaticScale" Mode="Edit" runat="server" />
                    <b>StaticScale</b> - Scale (zoom) value used to multiply the static map image size to define the output size in pixels.
                </li>
                <li>
                    <asp:DynamicControl DataField="Tilt" Mode="Edit" runat="server" />
                    <b>Tilt</b> - The angle of incidence of the map as measured in degrees from the viewport plane to the map plane (0 or 45).
                </li>
                <li>
                    <asp:DynamicControl DataField="Zoom" Mode="Edit" runat="server" />
                    <b>Zoom</b> - The initial Map zoom level. Required.
                </li>
            </ul>

            <div style="text-align: center;">
                <asp:Button runat="server" Text="Apply" CommandName="Update" CssClass="btn btn-primary" />
            </div>

        </EditItemTemplate>
    </asp:FormView>

    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
