<%@ Page Language="C#" MasterPageFile="../../Maps.master" AutoEventWireup="false" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Drawing.Options.Default" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Drawing Options Sample</h2>
        <p>A sample about ASP.NET Google Map Control drawing options.</p>
    </div>
    <p>
        Set different values to options below the map and click on "Apply" to see the result.
    </p>

    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8" Latitude="42.1229" Longitude="24.7879" CssClass="map" DefaultAddress="sofia"
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:DrawingManager ID="GoogleManager1" TargetControlID="GoogleMap1" runat="server" DrawingMode="CIRCLE">
            <DrawingControlOptions DrawingModes="circle, polygon, polyline" Position="TopLeft" />
        </map:DrawingManager>
    </div>

    <div class="row">
        <div class="form-group">
            <label>Show Drawing Control</label>
            <asp:CheckBox ID="cbShowDrawingControl" runat="server"></asp:CheckBox>
        </div>
        <div class="form-group col-md-6">
            <label>Drawing Control Position</label>
            <asp:DropDownList ID="ddlDrawingPositipon" runat="server" CssClass="form-control" SelectMethod="GetDrawingControlPosition" SelectedValue="<%# GoogleManager1.DrawingControlOptions.Position %>">
            </asp:DropDownList>
        </div>
        <div class="form-group col-md-6">
            <label>Default Drawing Mode</label>
            <asp:DropDownList ID="ddlDrawingMode" runat="server" CssClass="form-control" SelectMethod="GetDrawingModes" SelectedValue="<%# GoogleManager1.DrawingMode %>">
            </asp:DropDownList>
        </div>
        <div class="form-group">
            <label>Drawing Modes Enabled</label>
            <asp:CheckBoxList ID="cblDrawingModes" runat="server">
            </asp:CheckBoxList>
        </div>
        <button class="btn btn-primary">Apply</button>
    </div>

    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
