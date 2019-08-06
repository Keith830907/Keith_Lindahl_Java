<%@ Page Title="" Language="C#" MasterPageFile="Maps.master" AutoEventWireup="false" 
    CodeBehind="Bounds.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Bounds" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>
        Map Bounds
    </h2>
    <p>
        GoogleMap control bounds sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8" CssClass="map"
            Bounds-NorthEast-Latitude="42.2697868981211" Bounds-NorthEast-Longitude="24.9835939697266"
            Bounds-SouthWest-Latitude="42.02542336268529" Bounds-SouthWest-Longitude="24.5441408447266"
            Width="100%" Height="600px" FullscreenControl="true">
            <%--TODO uncoment to use different markup--%>
            <%--<Bounds NorthEast-Latitude="42.2697868981211" NorthEast-Longitude="24.9835939697266"
                SouthWest-Latitude="42.02542336268529" SouthWest-Longitude="24.5441408447266" />
            <Bounds>
                <NorthEast Latitude="42.2697868981211" Longitude="24.9835939697266" />
                <SouthWest Latitude="42.02542336268529" Longitude="24.5441408447266" />
            </Bounds>--%>
        </map:GoogleMap>
    </div>

    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.Read(@"\Samples\Maps\Bounds.aspx") %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.Read(@"\Samples\Maps\Bounds.aspx.cs") %></code></pre>
    <%--//CODE--%>
</asp:Content>
