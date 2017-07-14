package com.tripletres.cardboardprocessing4;

import android.os.Bundle;

import com.tripletres.cardboardprocessing4.sketch.CubeSketch;
import com.tripletres.cardboardprocessing4.sketch.GridSketch;
import com.tripletres.cardboardprocessing4.sketch.TwoSidesSketch;

import processing.core.PApplet;
import processing.vr.PVR;

public class PVRHolderActivity extends PVR {

    public static final String ARGS_CUBE = "ARGS_CUBE";
    public static final String ARGS_TWO_SIDES = "ARGS_TWO_SIDES";
    public static final String ARGS_GRID = "ARGS_GRID";

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
        if (b.containsKey(ARGS_TWO_SIDES))
            sketch = new TwoSidesSketch();
        if (b.containsKey(ARGS_GRID))
            sketch = new GridSketch();

        if (sketch != null)
            setSketch(sketch);
    }
}
