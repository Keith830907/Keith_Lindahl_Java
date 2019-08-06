<%@ Page Language="C#" MasterPageFile="../Overlays.master" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="Server">
    <h2>Multiple Polygons
    </h2>
    <p>
        GoogleMap control multiple polygons sample.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="44.1229" Longitude="24.7879"
            Zoom="4" CssClass="map" FullscreenControl="true" Width="100%" Height="600px">
        </map:GoogleMap>
        <map:GooglePolygon ID="GooglePolygon1" TargetControlID="GoogleMap1" runat="server">
            <map:LatLng Latitude="37.97918" Longitude="23.716647" />
            <map:LatLng Latitude="41.036501" Longitude="28.984895" />
            <map:LatLng Latitude="44.447924" Longitude="26.097879" />
            <map:LatLng Latitude="44.802416" Longitude="20.465601" />
            <map:LatLng Latitude="42.002411" Longitude="21.436097" />
            <map:LatLng Latitude="37.97918" Longitude="23.716647" />
        </map:GooglePolygon>
        <map:GooglePolygon ID="GooglePolygon2" TargetControlID="GoogleMap1" runat="server" FillColor="Blue">
            <map:LatLng Latitude="57.97918" Longitude="23.716647" />
            <map:LatLng Latitude="51.036501" Longitude="28.984895" />
            <map:LatLng Latitude="54.447924" Longitude="26.097879" />
            <map:LatLng Latitude="54.802416" Longitude="20.465601" />
            <map:LatLng Latitude="52.002411" Longitude="21.436097" />
            <map:LatLng Latitude="47.97918" Longitude="23.716647" />
        </map:GooglePolygon>
    </div>
</asp:Content>
