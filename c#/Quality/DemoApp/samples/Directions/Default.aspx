<%@ Page Title="" Language="C#" MasterPageFile="Directions.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Directions.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Directions Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control directions usage.
        </p>
    </div>
    <p>
        Enter the desired origin and destination of directions to show and click the 'Show' button.
    </p>
    <fieldset>
        <legend>Directions</legend>
        <p>
            <asp:Label runat="server" Text="Origin" AssociatedControlID="txtOrigin" />
            <asp:TextBox ID="txtOrigin" runat="server" Width="400px"></asp:TextBox>
        </p>
        <p>
            <asp:Label runat="server" Text="Destination" AssociatedControlID="txtDestination" />
            <asp:TextBox ID="txtDestination" runat="server" Width="400px"></asp:TextBox>
        </p>
        <p style="margin-bottom: 0;">
            <label>
                &nbsp;</label>
            <asp:Button runat="server" Text="Show" OnClick="HandleShowClick" />
        </p>
    </fieldset>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="4" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleDirections ID="GoogleDirections1" TargetControlID="GoogleMap1" runat="server"
            Origin="plovdiv" Destination="sofia" Draggable="true" PanelID="route">
        </map:GoogleDirections>
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
