<%@ Page Language="C#" MasterPageFile="../Maps.master" AutoEventWireup="false" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.State.Default" %>

<asp:Content ID="mainContent" ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Map State Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control post-back state persistence.
        </p>
    </div>
    <p style="padding-bottom: 10px;">
        Add GoogleMapState extender of GoogleMap control when you need to persist and send to server the current map state (center, map type and zoom) during post-back.
        Here we just save and load current state to user session.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" CssClass="map" Address="Google Headquarters, Castro Street, Mountain View, CA" Zoom='8'
            Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <%--<map:GoogleMapState ID="GoogleMapState1" runat="server" TargetControlID="GoogleMap1"></map:GoogleMapState>--%>
    </div>
    <div class="row">
        <div class="col-md-6">
            <h4>Save current state</h4>
            <asp:Button ID="btnSave" runat="server" Text="Save State" OnClick="HandleSaveClick" CssClass="btn btn-primary" />
        </div>
        <div class="col-md-6">
            <h4>Load last saved state</h4>
            <asp:Button ID="btnLoad" runat="server" Text="Load State" OnClick="HandleLoadClick" CssClass="btn btn-primary" />
        </div>
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
