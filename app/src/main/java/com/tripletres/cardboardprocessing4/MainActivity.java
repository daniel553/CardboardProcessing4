package com.tripletres.cardboardprocessing4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.activity_main_cube).setOnClickListener(this);
        findViewById(R.id.activity_main_two_sides).setOnClickListener(this);
        findViewById(R.id.activity_main_grid).setOnClickListener(this);
        findViewById(R.id.activity_main_sphere).setOnClickListener(this);
        findViewById(R.id.activity_main_shape_group).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_cube:
                openPVRHolder(PVRHolderActivity.ARGS_CUBE);
                break;
            case R.id.activity_main_two_sides:
                openPVRHolder(PVRHolderActivity.ARGS_TWO_SIDES);
                break;
            case R.id.activity_main_grid:
                openPVRHolder(PVRHolderActivity.ARGS_GRID);
                break;
            case R.id.activity_main_sphere:
                openPVRHolder(PVRHolderActivity.ARGS_SPHERE);
                break;
            case R.id.activity_main_shape_group:
                openPVRHolder(PVRHolderActivity.ARGS_SHAPE_GROUP);
                break;
            default:
                break;
        }
    }

    /**
     * Open PVRHolder
     *
     * @param argsSketch
     */
    private void openPVRHolder(String argsSketch) {
        Intent intent = new Intent(this, PVRHolderActivity.class);
        intent.putExtra(argsSketch, true);
        startActivity(intent);
    }
}
