﻿using System;
using System.Collections.Generic;
using GoogleMaps.Polylines;

namespace GoogleMaps.Samples.samples.Polylines.CodeBehind
{
    public partial class Default : System.Web.UI.Page
    {
        protected override void OnLoad(EventArgs e)
        {
            base.OnLoad(e);

            GoogleMap1.Polylines.Add(new GooglePolyline
            {
                Clickable = true,
                Draggable = true,
                Editable = true,
                OnClientClick = "handleClick",
                StrokeWeight = 10,
                Path = new List<LatLng>
                {
                    new LatLng(42.14304, 24.74967),
                    new LatLng(42.69649, 23.32601)
                }
            });
        }
    }
}
