<%@ Page Language="C#" MasterPageFile="~/samples/Polylines/Polylines.master" AutoEventWireup="true" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.samples.Polylines.CodeBehind.Default" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <div class="jumbotron">
        <h2>Polyline Code-Behind Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control adding polyline from code-behind.
        </p>
    </div>
    <p>
        This is a demo how to add a polylines to Google Map Control in the code behind.
    </p>

    <div class='map-wrap'>
        <map:GoogleMap ID='GoogleMap1' runat='server' Width='100%' Height='600px' Latitude='42.1229'
            Longitude='24.7879' Zoom='7' CssClass='map' FullscreenControl="true">
        </map:GoogleMap>
    </div>

    <script type='text/javascript'>
        function handleClick(sender, e) {
            if (console) console.dir(e);
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>

    <h3>Code Behind</h3>
    <pre><code class="cs"><%= SourceReader.ReadCode() %></code></pre>
    <%--//CODE--%>
</asp:Content>
