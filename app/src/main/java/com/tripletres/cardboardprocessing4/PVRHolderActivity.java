package com.tripletres.cardboardprocessing4;

import android.os.Bundle;

import com.tripletres.cardboardprocessing4.sketch.CubeSketch;

import processing.core.PApplet;
import processing.vr.PVR;

public class PVRHolderActivity extends PVR {

    public static final String ARGS_CUBE = "ARGS_CUBE";

    private PApplet sketch = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvrholder);
        setArgsSketch(getIntent().getExtras());
    }

    private void setArgsSketch(final Bundle b) {
        if (b.containsKey(ARGS_CUBE))
            sketch = new CubeSketch();

        if (sketch != null)
            setSketch(sketch);
    }
}
