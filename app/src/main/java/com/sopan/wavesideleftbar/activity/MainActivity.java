package com.sopan.wavesideleftbar.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sopan.wavesideleftbar.R;

/**
 * Created by Sopan on 9/3/16.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRightPositionSample(View view) {
        Intent intent = new Intent(this, RightPositionActivity.class);
        startActivity(intent);
    }

    public void openLeftPositionSample(View view) {
        Intent intent = new Intent(this, LeftPositionActivity.class);
        startActivity(intent);
    }

    public void openCustomIndexSample(View view) {
        Intent intent = new Intent(this, CustomIndexActivity.class);
        startActivity(intent);
    }
}
