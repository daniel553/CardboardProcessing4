package com.tripletres.cardboardprocessing4.sketch;

import processing.core.PApplet;
import processing.opengl.PShader;

/**
 * Sphere with Shaders
 * <p>
 * Created by Daniel on 13/07/2017.
 */

public class SphereSketch extends PApplet {

    private PShader toon;
    private boolean shaderEnabled = true;

    @Override
    public void settings() {
        fullScreen(STEREO);
    }

    @Override
    public void setup() {
        noStroke();
        fill(204);
        toon = loadShader("toonfrag", "toonvert");
    }

    @Override
    public void draw() {
        if (shaderEnabled)
            shader(toon);
        translate(width / 2, height / 2, 100);
        background(80);
        directionalLight(204, 204, 204, 1, 1, -1);
        sphere(100);
    }

    @Override
    public void mousePressed() {
        if(shaderEnabled)
            resetShader();
        shaderEnabled = !shaderEnabled;
    }
}
