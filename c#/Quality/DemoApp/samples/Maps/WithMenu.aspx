<%@ Page Language="C#" MasterPageFile="Maps.master" %>

<asp:Content ID="Content2" ContentPlaceHolderID="MainContent" runat="Server">
    <h2>
        Map With Menu
    </h2>
    <p>
        GoogleMap control on page with ASP.NET menu sample.
    </p>
    <asp:Menu ID="Menu1" runat="server" Orientation="Horizontal">
        <Items>
            <asp:MenuItem Text="Item 1"/>
            <asp:MenuItem Text="Item 2"/>
        </Items>
    </asp:Menu>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8" Latitude="42.1229"
            Longitude="24.7879" CssClass="map" DefaultAddress="sofia" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>
</asp:Content>
