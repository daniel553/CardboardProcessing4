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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_cube:
                openPVRHolder(PVRHolderActivity.ARGS_CUBE);
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
        intent.putExtra(PVRHolderActivity.ARGS_CUBE, argsSketch);
        startActivity(intent);
    }
}
