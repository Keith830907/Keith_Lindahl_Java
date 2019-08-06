<%@ Page Language="C#" MasterPageFile="../Maps.master" AutoEventWireup="false" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.Static.Default" %>

<asp:Content runat="server" ContentPlaceHolderID="MainContent">
    <div class="jumbotron">
        <h2>Static Map Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control static map mode.
        </p>
    </div>
    <p>
        The ASP.NET Google Map Control static map mode produce an image of a map based on the provided options.<br />
        Put a Lat/Lng location or address bellow and click Show button to get the produces static map as image.<br />
        You can use many more options for producing static maps on your pages.
    </p>
    <fieldset>
        <legend>Select Location</legend>
        <div>
            <asp:Label ID="Label1" runat="server" Text="Point" AssociatedControlID="txtPoint" />
            <asp:TextBox ID="txtPoint" runat="server" Width="160px" />
            <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ControlToValidate="txtPoint"
                ErrorMessage="Invalid latitude/longitude format. Must be (^\-?\d+\.?\d+/\-?\d+\.?\d+$)"
                ValidationExpression="^\-?\d+\.?\d+/\-?\d+\.?\d+$" ValidationGroup="LocationValidation">*</asp:RegularExpressionValidator>
            format(Lat/Lng), or
        </div>
        <div>
            <asp:Label ID="Label2" runat="server" Text="Address" AssociatedControlID="txtAddress" />
            <asp:TextBox ID="txtAddress" runat="server" Width="300px" />
        </div>
        <div style="padding-left: 120px;">
            <asp:Button ID="Button1" runat="server" Text="Show" OnClick="HandleShowClick" ValidationGroup="LocationValidation" />
        </div>
        <div>
            <asp:ValidationSummary ID="ValidationSummary1" runat="server" ValidationGroup="LocationValidation" />
        </div>
    </fieldset>
    <div class="map-wrap">
        <map:GoogleStaticMap ID="GoogleMap1" runat="server" MapType="HYBRID" Zoom="8"
            CssClass="map" Language="en" Center-Latitude="42.1229" Center-Longitude="24.7879" Width="800px">
        </map:GoogleStaticMap>
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
