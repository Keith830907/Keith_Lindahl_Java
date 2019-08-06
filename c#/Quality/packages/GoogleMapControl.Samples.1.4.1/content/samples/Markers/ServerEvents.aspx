<%@ Page Title="" Language="C#" MasterPageFile="Markers.master" AutoEventWireup="true" CodeBehind="ServerEvents.aspx.cs" Inherits="GoogleMaps.Samples.Markers.ServerEvents" %>

<asp:Content ID="Content1" ContentPlaceHolderID="MainContent" runat="server">
    <h2>
        Markers Server Events
    </h2>
    <p>
        GoogleMap control markers server event handling sample.
        <br />
        The markers fire next events: animation changed, click, clickable changed, cursor
        changed, double click, drag, draggable changed, drag end, drag start, flat changed,
        icon changed, mouse down, mouse out, mouse over, mouse up, position changed, right
        click, shadow changed, shape changed, title changed, visible changed, z-index changed.
        <br />
        The event fired by the polyline will be listed in the info list bellow (most recent
        first).
    </p>
    <div class="map-wrap">
        <map:GoogleMap ID="GoogleMap1" runat="server" Latitude="42.1229" Longitude="24.7879"
            Zoom="4" EnableScrollWheelZoom="true" CssClass="map" Width="100%" Height="600px" FullscreenControl="true">
        </map:GoogleMap>
        <map:GoogleMarkers ID="GoogleMarkers1" TargetControlID="GoogleMap1" runat="server" OnDragEnd="HandleDragEnd">
            <%--OnClick="HandleClick" OnRightClick="HandleRightClick" OnPositionChanged="HandlePositionChanged">--%>
            <%--
            TODO Add some of those bellow to test them:
            OnAnimationChanged="HandleAnimationChanged"
            OnClickableChanged="HandleClickableChanged"
            OnCursorChanged="HandleCursorChanged"
            OnDoubleClick="HandleDoubleClick"
            OnDrag="HandleDrag"
            OnDragEnd="HandleDragEnd"
            OnDraggableChanged="HandleDraggableChanged"
            OnDragStart="HandleDragStart"
            OnFlatChanged="HandleFlatChanged"
            OnIconChanged="HandleIconChanged"
            OnMouseDown="HandleMouseDown"
            OnMouseOut="HandleMouseOut"
            OnMouseOver="HandleMouseOver"
            OnMouseUp="HandleMouseUp"
            OnRightClick="HandleRightClick"
            OnShadowChanged="HandleShadowChanged"
            OnShapeChanged="HandleShapeChanged"
            OnTitleChanged="HandleTitleChanged"
            OnVisibleChanged="HandleVisibleChanged"
            OnZIndexChanged="HandleZIndexChanged"
            --%>
            <%--<Markers>
                <map:Marker Position-Latitude="42.1229" Position-Longitude="24.7879" Title="Click on the marker"
                    Info="Text of marker 1">
                </map:Marker>
                <map:Marker Position-Latitude="42.1229" Position-Longitude="20." Title="Click on the marker"
                    Info="Text of marker 2">
                </map:Marker>
            </Markers>
            <MarkerOptions Draggable="true" >
            </MarkerOptions>--%>
        </map:GoogleMarkers>
    </div>
    <div>
        Events (most recent first):
        <asp:Button ID="Button1" runat="server" Text="Clear" OnClick="HandleClearClick" />
    </div>
    <asp:ListBox ID="lbEvents" runat="server" Rows="20" Width="100%"></asp:ListBox>
</asp:Content>
