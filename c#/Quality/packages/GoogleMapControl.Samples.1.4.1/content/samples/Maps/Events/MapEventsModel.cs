using System;

namespace GoogleMaps.Samples.Maps.Events
{
    [Serializable]
    public class MapEventsModel
    {
        public bool HandleBoundsChangedOnClient { get; set; }
        public bool HandleBoundsChangedOnServer { get; set; }

        public bool HandleCenterChangedOnClient { get; set; }
        public bool HandleCenterChangedOnServer { get; set; }

        public bool HandleClickOnClient { get; set; }
        public bool HandleClickOnServer { get; set; }

        public bool HandleDoubleClickOnClient { get; set; }
        public bool HandleDoubleClickOnServer { get; set; }

        public bool HandleDragOnClient { get; set; }
        public bool HandleDragOnServer { get; set; }

        public bool HandleDragEndOnClient { get; set; }
        public bool HandleDragEndOnServer { get; set; }

        public bool HandleDragStartOnClient { get; set; }
        public bool HandleDragStartOnServer { get; set; }

        public bool HandleHeadingChangedOnClient { get; set; }
        public bool HandleHeadingChangedOnServer { get; set; }

        public bool HandleIdleOnClient { get; set; }
        public bool HandleIdleOnServer { get; set; }

        public bool HandleMapTypeChangedOnClient { get; set; }
        public bool HandleMapTypeChangedOnServer { get; set; }

        public bool HandleMouseMoveOnClient { get; set; }
        public bool HandleMouseMoveOnServer { get; set; }

        public bool HandleMouseOutOnClient { get; set; }
        public bool HandleMouseOutOnServer { get; set; }

        public bool HandleMouseOverOnClient { get; set; }
        public bool HandleMouseOverOnServer { get; set; }

        public bool HandleProjectionChangedOnClient { get; set; }
        public bool HandleProjectionChangedOnServer { get; set; }

        public bool HandleResizeOnClient { get; set; }
        public bool HandleResizeOnServer { get; set; }

        public bool HandleRightClickOnClient { get; set; }
        public bool HandleRightClickOnServer { get; set; }

        public bool HandleTilesLoadedOnClient { get; set; }
        public bool HandleTilesLoadedOnServer { get; set; }

        public bool HandleTiltChangedOnClient { get; set; }
        public bool HandleTiltChangedOnServer { get; set; }

        public bool HandleZoomChangedOnClient { get; set; }
        public bool HandleZoomChangedOnServer { get; set; }

        public string EventsList { get; set; }
    }
}