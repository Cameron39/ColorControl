/*
Cameron Pitcel
CSC 470D Introduction to Android
Fall 2018

Project 3
Color Fun Project

 */

package com.example.cpitcel.colorcontrol;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbRed, sbGreen, sbBlue, sbAlpha;
    TextView tvRed, tvGreen, tvBlue, tvAlpha, tvRedVal, tvGreenVal, tvBlueVal, tvAlphaVal;
    View colorView;
    int redVal, greenVal, blueVal, alphaVal;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbRed = findViewById(R.id.sbRed);
        sbGreen = findViewById(R.id.sbGreen);
        sbBlue = findViewById(R.id.sbBlue);
        sbAlpha = findViewById(R.id.sbAlpha);
        tvRed = findViewById(R.id.tvRed);
        tvGreen = findViewById(R.id.tvGreen);
        tvBlue = findViewById(R.id.tvBlue);
        tvAlpha = findViewById(R.id.tvAlpha);
        tvRedVal = findViewById(R.id.tvRedVal);
        tvGreenVal = findViewById(R.id.tvGreenVal);
        tvBlueVal = findViewById(R.id.tvBlueVal);
        tvAlphaVal = findViewById(R.id.tvAlphaVal);
        colorView = findViewById(R.id.colorView);

        //Need to set this else for the onProgressChange to work
        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
        sbAlpha.setOnSeekBarChangeListener(this);

        //Generate random numbers for initial value
        redVal = new Random().nextInt(255);
        greenVal = new Random().nextInt(255);
        blueVal = new Random().nextInt(255);
        alphaVal = new Random().nextInt(255);

        //set the initial values
        sbRed.setProgress(redVal);
        sbGreen.setProgress(greenVal);
        sbBlue.setProgress(blueVal);
        sbAlpha.setProgress(alphaVal);

        //colorView.setBackgroundColor(Color.argb(alphaVal, redVal, greenVal, blueVal));
        Log.i("Color", "End of On Create");
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.i("Color", "onProgressChanged: ");
        switch (seekBar.getId()) {
            case R.id.sbRed:
                Log.i("Color", "Red Progress Changed");
                tvRedVal.setText(String.valueOf(progress));
                break;
            case R.id.sbGreen:
                Log.i("Color", "Green Progress Changed");
                tvGreenVal.setText(String.valueOf(progress));
                break;
            case R.id.sbBlue:
                Log.i("Color", "Blue Progress Changed");
                tvBlueVal.setText(String.valueOf(progress));
                break;
            case R.id.sbAlpha:
                Log.i("Color", "Alpha Progress Changed");
                tvAlphaVal.setText(String.valueOf(progress));
                break;
            default:
                break;
        }
        Log.i("Color", "Done with Switch");
        colorView.setBackgroundColor(Color.argb(sbAlpha.getProgress(), sbRed.getProgress(), sbGreen.getProgress(), sbBlue.getProgress()));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Log.i("Color", "OnStartTrackingTouch");
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Log.i("Color", "onStopTrackingTouch");
    }
}
