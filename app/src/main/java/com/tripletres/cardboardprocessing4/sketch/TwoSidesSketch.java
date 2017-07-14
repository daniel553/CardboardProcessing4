package com.tripletres.cardboardprocessing4.sketch;

import processing.core.PApplet;
import processing.vr.PGraphicsVR;
import processing.vr.PVR;

/**
 * See 2 sides of visor.
 * Red and Blue like an antique 3D visor
 * Created by Daniel on 13/07/2017.
 */

public class TwoSidesSketch extends PApplet{

    @Override
    public void settings() {
        fullScreen(STEREO);
    }

    @Override
    public void draw() {
        PGraphicsVR pvr = (PGraphicsVR)g;
        if (pvr.eyeType == PVR.LEFT) {
            background(200, 50, 50);
        } else if (pvr.eyeType == PVR.RIGHT) {
            background(50, 50, 200);
        } else if (pvr.eyeType == PVR.MONOCULAR) {
            background(50, 200, 50);
        }
    }
}
