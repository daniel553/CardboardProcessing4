package com.tripletres.cardboardprocessing4;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.net.URL;

import processing.core.PApplet;
import processing.vr.PVR;

public class MainActivity extends PVR {

    final static int REQUEST_READ = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSketch(new Sketch());
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_READ: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    class Sketch extends PApplet {
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

}
