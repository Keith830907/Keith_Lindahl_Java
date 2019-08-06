<%@ Page Language="C#" MasterPageFile="../Maps.master" AutoEventWireup="false" CodeBehind="Default.aspx.cs" Inherits="GoogleMaps.Samples.Maps.DataBinding.Default" %>

<asp:Content ID="mainContent" ContentPlaceHolderID="MainContent" runat="Server">
    <div class="jumbotron">
        <h2>Data Binding Sample</h2>
        <p>
            A sample about data binding of ASP.NET Google Map Control options.
        </p>
    </div>
    <p style="padding-bottom: 10px;">
        The GoogleMap ASP.NET control is not data-bound web server control by itself, 
        but can be placed inside another data-bound control and some of its properties could be bind to data source values.
    </p>
    <asp:FormView ID="fvGooleDataBound" runat="server" DataSourceID="odsGoogleMap" DefaultMode="ReadOnly" Width="100%">
        <ItemTemplate>
            <div class="map-wrap">
                <map:GoogleMap ID="GoogleMap1" runat="server" CssClass="map" Latitude='<%# DataBinder.Eval(Container.DataItem, "Latitude") %>'
                    Longitude='<%# DataBinder.Eval(Container.DataItem, "Longitude") %>' Zoom='<%# DataBinder.Eval(Container.DataItem, "Zoom") %>'
                    MapType='<%# DataBinder.Eval(Container.DataItem, "MapType") %>' Width="100%" Height="600px" FullscreenControl="true">
                </map:GoogleMap>
                <map:GoogleMapState ID="GoogleMapState1" runat="server" TargetControlID="GoogleMap1"></map:GoogleMapState>
            </div>
        </ItemTemplate>
    </asp:FormView>
    <asp:ObjectDataSource ID="odsGoogleMap" runat="server" OldValuesParameterFormatString="{0}"
        SelectMethod="GetMapData" TypeName="GoogleMaps.Samples.Data.SampleDataSource">
        <SelectParameters>
            <asp:ControlParameter ControlID="lbStates" Name="id" PropertyName="SelectedValue" Type="Int64" />
        </SelectParameters>
    </asp:ObjectDataSource>
    <div class="row">
        <div class="col-md-6">
            <h4>Load saved map</h4>
            <div class="form-group">
                <asp:Label runat="server">Last 10 Saved (select to load):</asp:Label>
                <asp:ListBox ID="lbStates" runat="server" CssClass="form-control" AutoPostBack="true"></asp:ListBox>
            </div>
        </div>
        <div class="col-md-6">
            <h4>Save current map</h4>
            <div class="form-group">
                <asp:Label ID="lblName" runat="server" Text="Name:"></asp:Label>
                <asp:TextBox ID="txtName" runat="server" CssClass="form-control"></asp:TextBox>
            </div>
            <asp:Button ID="btnSave" runat="server" Text="Save" OnClick="HandleSaveClick" CssClass="btn btn-primary" />
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
