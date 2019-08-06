<%@ Page Language="C#" MasterPageFile="../Directions.master" %>

<asp:Content ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Directions Client Events Sample</h2>
        <p>
            A sample about ASP.NET Google Map Control directions client events usage.
        </p>
    </div>
    <p>
        Shows how to handle on the client using JavaScript the events fired by Google Map Directions.
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="4" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleDirections ID="GoogleDirections1" TargetControlID="GoogleMap1" runat="server"
            OnClientChanged="handleChanged" Origin="plovdiv" Destination="sofia" Draggable="true"
            PanelID="route">
        </map:GoogleDirections>
    </div>

    <div id="route"></div>

    <script type="text/javascript">
        function handleChanged(sender) {
            /// <summary>Handles google directions changed event.<summary>
            /// <param name="sender" type="Function">the instance of google directions which fired the event</param>

            // output params and info to console, if exists
            if (console) {
                console.dir(sender);
                console.dir(sender.getDirections());
            }
            alert("Directions was changed!");
        }
    </script>
    <%--CODE--%>
    <hr />
    <h2>Source</h2>

    <h3>Markup</h3>
    <pre><code class="html"><%: SourceReader.ReadMarkup() %></code></pre>
    <%--//CODE--%>
</asp:Content>
