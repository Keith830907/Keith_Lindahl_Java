using System;

namespace GoogleMaps.Samples.Maps.Events
{
    public partial class Default : System.Web.UI.Page
    {
        private MapEventsModel _model;

        public MapEventsModel GetMapEventsModel()
        {
            return _model ?? new MapEventsModel();
        }

        public void UpdateMapEventsModel(MapEventsModel model)
        {
            _model = model;
            SetMapEvents();
        }

        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            _model = ViewState["model"] as MapEventsModel;

            if (_model != null)
            {
                SetMapEvents();
            }
        }

        protected override void OnPreRender(EventArgs e)
        {
            base.OnPreRender(e);
            if (_model != null)
            {
                ViewState.Add("model", _model);
            }
        }

        private void PrintMouseEvent(string name, MouseEventArgs e)
        {
            lbEventsList.Items.Add($"[Server] {name} was fired at position [lat: {e.Position.Latitude} , lng: {e.Position.Longitude} ]");
        }

        private void PrintMapEvent(string name, MapEventArgs e)
        {
            lbEventsList.Items.Add($"[Server] {name} was fired with map settings [bounds: {e.Bounds} , center: {e.Center}, mapType: {e.MapType}, zoom: {e.Zoom} ]");
        }

        private void PrintEvent(string name, EventArgs e)
        {
            lbEventsList.Items.Add($"[Server] {name} was fired.");
        }

        private void SetMapEvents()
        {
            if (_model.HandleBoundsChangedOnClient)
            {
                GoogleMap1.OnClientBoundsChanged = "handleBoundsChanged";
            }
            if (_model.HandleBoundsChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.BoundsChanged += (s, e) => PrintMapEvent(nameof(GoogleMap1.BoundsChanged), e);
            }

            if (_model.HandleCenterChangedOnClient)
            {
                GoogleMap1.OnClientCenterChanged = "handleCenterChanged";
            }
            if (_model.HandleCenterChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.CenterChanged += (s, e) => PrintMapEvent(nameof(GoogleMap1.CenterChanged), e);
            }

            if (_model.HandleClickOnClient)
            {
                GoogleMap1.OnClientClick = "handleClick";
            }
            if (_model.HandleClickOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.Click += (s, e) => PrintMouseEvent(nameof(GoogleMap1.Click), e);
            }

            if (_model.HandleDoubleClickOnClient)
            {
                GoogleMap1.OnClientDoubleClick = "handleDoubleClick";
            }
            if (_model.HandleDoubleClickOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.DoubleClick += (s, e) => PrintMouseEvent(nameof(GoogleMap1.DoubleClick), e);
            }

            if (_model.HandleDragOnClient)
            {
                GoogleMap1.OnClientDrag = "handleDrag";
            }
            if (_model.HandleDragOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.Drag += (s, e) => PrintMapEvent(nameof(GoogleMap1.Drag), e);
            }

            if (_model.HandleDragEndOnClient)
            {
                GoogleMap1.OnClientDragEnd = "handleDragEnd";
            }
            if (_model.HandleDragEndOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.DragEnd += (s, e) => PrintMapEvent(nameof(GoogleMap1.DragEnd), e);
            }

            if (_model.HandleDragStartOnClient)
            {
                GoogleMap1.OnClientDragStart = "handleDragStart";
            }
            if (_model.HandleDragStartOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.DragStart += (s, e) => PrintMapEvent(nameof(GoogleMap1.DragStart), e);
            }

            if (_model.HandleHeadingChangedOnClient)
            {
                GoogleMap1.OnClientHeadingChanged = "handleHeadingChanged";
            }
            if (_model.HandleHeadingChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.HeadingChanged += (s, e) => PrintEvent(nameof(GoogleMap1.HeadingChanged), e);
            }

            if (_model.HandleIdleOnClient)
            {
                GoogleMap1.OnClientIdle = "handleIdle";
            }
            if (_model.HandleHeadingChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.Idle += (s, e) => PrintEvent(nameof(GoogleMap1.Idle), e);
            }

            if (_model.HandleMapTypeChangedOnClient)
            {
                GoogleMap1.OnClientMapTypeChanged = "handleMapTypeChanged";
            }
            if (_model.HandleMapTypeChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.MapTypeChanged += (s, e) => PrintMapEvent(nameof(GoogleMap1.MapTypeChanged), e);
            }

            if (_model.HandleMouseMoveOnClient)
            {
                GoogleMap1.OnClientMouseMove = "handleMouseMove";
            }
            if (_model.HandleMouseMoveOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.MouseMove += (s, e) => PrintMouseEvent(nameof(GoogleMap1.MouseMove), e);
            }

            if (_model.HandleMouseOutOnClient)
            {
                GoogleMap1.OnClientMouseOut = "handleMouseOut";
            }
            if (_model.HandleMouseOutOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.MouseOut += (s, e) => PrintMouseEvent(nameof(GoogleMap1.MouseOut), e);
            }

            if (_model.HandleMouseOverOnClient)
            {
                GoogleMap1.OnClientMouseOver = "handleMouseOver";
            }
            if (_model.HandleMouseOverOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.MouseOver += (s, e) => PrintMouseEvent(nameof(GoogleMap1.MouseOver), e);
            }

            if (_model.HandleProjectionChangedOnClient)
            {
                GoogleMap1.OnClientProjectionChanged = "handleProjectionChanged";
            }
            if (_model.HandleProjectionChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.ProjectionChanged += (s, e) => PrintEvent(nameof(GoogleMap1.ProjectionChanged), e);
            }

            if (_model.HandleResizeOnClient)
            {
                GoogleMap1.OnClientResize = "handleResize";
            }
            if (_model.HandleResizeOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.Resize += (s, e) => PrintMapEvent(nameof(GoogleMap1.Resize), e);
            }

            if (_model.HandleRightClickOnClient)
            {
                GoogleMap1.OnClientRightClick = "handleRightClick";
            }
            if (_model.HandleRightClickOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.RightClick += (s, e) => PrintMouseEvent(nameof(GoogleMap1.RightClick), e);
            }

            if (_model.HandleTilesLoadedOnClient)
            {
                GoogleMap1.OnClientTilesLoaded = "handleTilesLoaded";
            }
            if (_model.HandleTilesLoadedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.TilesLoaded += (s, e) => PrintEvent(nameof(GoogleMap1.TilesLoaded), e);
            }

            if (_model.HandleTiltChangedOnClient)
            {
                GoogleMap1.OnClientTiltChanged = "handleTiltChanged";
            }
            if (_model.HandleTiltChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.TiltChanged += (s, e) => PrintEvent(nameof(GoogleMap1.TiltChanged), e);
            }

            if (_model.HandleZoomChangedOnClient)
            {
                GoogleMap1.OnClientZoomChanged = "handleZoomChanged";
            }
            if (_model.HandleZoomChangedOnServer)
            {
                // we just adding a lambda event handler here, but you can specify any method with the proper signature
                GoogleMap1.ZoomChanged += (s, e) => PrintMapEvent(nameof(GoogleMap1.ZoomChanged), e);
            }
        }
    }
}