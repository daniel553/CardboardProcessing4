package com.tripletres.cardboardprocessing4.sketch;

import processing.core.PApplet;
import processing.core.PShape;

/**
 * Simple grid example
 *
 * Created by Daniel on 13/07/2017.
 */

public class GridSketch extends PApplet {
    private PShape grid;

    @Override
    public void settings() {
        fullScreen(STEREO);
    }

    @Override
    public void setup() {
        grid = createShape();
        grid.beginShape(LINES);
        grid.stroke(255);
        for (int x = -10000; x < +10000; x += 250) {
            grid.vertex(x, +1000, +10000);
            grid.vertex(x, +1000, -10000);
        }
        for (int z = -10000; z < +10000; z += 250) {
            grid.vertex(+10000, +1000, z);
            grid.vertex(-10000, +1000, z);
        }
        grid.endShape();
    }

    @Override
    public void draw() {
        background(0);
        translate(width / 2, height / 2);
        shape(grid);
    }
}
