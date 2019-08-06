<%@ Page Language="C#" MasterPageFile="~/samples/Polylines/Polylines.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Polylines.ServerEvents.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Polyline Server Events Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control polyline server events usage.
        </p>
    </div>
    <p>
        GoogleMap control polyline server event handling sample.
        <br />
        The polyline fires next events: click, double click, mouse down, mouse move, mouse
        out, mouse over, mouse up, right click.<br />
        The event fired by the polyline will be listed in the info list bellow (most recent
        first) by the server side code.
    </p>

    <asp:RadioButtonList ID="SelectedEvent" runat="server" RepeatLayout="Flow">
        <asp:ListItem Text="Click" />
        <asp:ListItem Text="DoubleClick" />
        <asp:ListItem Text="MouseDown" />
        <asp:ListItem Text="MouseOut" />
        <asp:ListItem Text="MouseOver" />
        <asp:ListItem Text="MouseUp" />
        <asp:ListItem Text="RightClick" />
    </asp:RadioButtonList>

    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229" Longitude="24.7879" Zoom="7" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
        <map:GooglePolyline ID="GooglePolyline1" TargetControlID="GoogleMap1" runat="server"
            StrokeWeight="10" Clickable="true" OnClick="HandleClick" Draggable="true" Editable="true">
            <map:LatLng Latitude="42.14304" Longitude="24.74967" />
            <map:LatLng Latitude="42.69649" Longitude="23.32601" />
        </map:GooglePolyline>
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
