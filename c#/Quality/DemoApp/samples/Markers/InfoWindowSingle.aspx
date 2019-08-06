<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="false" CodeBehind="InfoWindowSingle.aspx.cs" Inherits="GoogleMaps.Samples.Markers.InfoWindowSingle" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>
        Only one info window
    </h2>
    <p>
        Show only one info window on click
    </p>
    <div class="map-wrap">
        <asp:Panel runat="server" ID="pnlControls">
        </asp:Panel>
    </div>
</asp:Content>
