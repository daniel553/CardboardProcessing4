package com.tripletres.cardboardprocessing4.sketch;

import processing.core.PApplet;

/**
 * Rotating cube example sketch
 *
 * Created by Daniel on 13/07/2017.
 */

public class CubeSketch extends PApplet {
    @Override
    public void settings() {
        fullScreen(STEREO);
    }

    @Override
    public void draw() {
        background(157);
        lights();
        translate(width/2, height/2);
        rotateX(frameCount * 0.01f);
        rotateY(frameCount * 0.01f);
        box(500);
    }
}
