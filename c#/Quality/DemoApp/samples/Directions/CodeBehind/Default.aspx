<%@ Page Language="C#" MasterPageFile="~/samples/Directions/Directions.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Directions.CodeBehind.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Directions With Code-Behind Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control adding directions in the code.
        </p>
    </div>
    <p>
        Enter the desired origin and destination of directions to show and click the 'Show' button.
    </p>
    <fieldset>
        <legend>Directions</legend>
        <p>
            <asp:Label ID="Label1" runat="server" Text="Origin" AssociatedControlID="txtOrigin" />
            <asp:TextBox ID="txtOrigin" runat="server" Width="400px"></asp:TextBox>
        </p>
        <p>
            <asp:Label ID="Label2" runat="server" Text="Destination" AssociatedControlID="txtDestination" />
            <asp:TextBox ID="txtDestination" runat="server" Width="400px"></asp:TextBox>
        </p>
        <p style="margin-bottom: 0;">
            <label>
                &nbsp;</label>
            <asp:Button ID="Button1" runat="server" Text="Show" OnClick="HandleShowClick" />
        </p>
    </fieldset>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="4" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
    </div>
    <div id="route">
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
