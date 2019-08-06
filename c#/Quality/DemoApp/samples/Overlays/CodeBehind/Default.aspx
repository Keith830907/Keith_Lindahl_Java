<%@ Page Language="C#" MasterPageFile="~/samples/Overlays/Overlays.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Overlays.CodeBehind.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Polygon Code-Behind Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control overlay in code-behind.
        </p>
    </div>
    <p>
        A demo about how easy it to add ASP.NET Google Map Control overlay in the code-behind.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Width="100%" Height="600px" Latitude="42.1229"
            Longitude="24.7879" Zoom="6" CssClass="map" FullscreenControl="true">
        </map:GoogleMap>
    </div>
    <asp:Label ID="lblInfo" runat="server"></asp:Label>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
