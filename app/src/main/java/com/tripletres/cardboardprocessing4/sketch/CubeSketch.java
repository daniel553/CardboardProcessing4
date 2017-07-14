package com.tripletres.cardboardprocessing4.sketch;

import processing.core.PApplet;

/**
 * Rotating cube example sketch
 * <p>
 * Created by Daniel on 13/07/2017.
 */

public class CubeSketch extends PApplet {

    private float dx = 300;
    private float dy = 0;

    @Override
    public void settings() {
        fullScreen(STEREO);
        //size(500, 500);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        background(157);
        lights();
        translate(dx, dy);
        rotateX(frameCount * 0.01f);
        rotateY(frameCount * 0.01f);
        box(200);
        //dx++;
        dy++;
        if (dx > 1000)
            dx = 0;
        if (dy > 2000)
            dy = 0;
    }
}
