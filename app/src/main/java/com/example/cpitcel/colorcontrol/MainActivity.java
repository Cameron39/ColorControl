package com.example.cpitcel.colorcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar sbRed, sbGreen, sbBlue, sbAlpha;
    TextView tvRed, tvGreen, tvBlue, tvAlpha, tvRedVal, tvGreenVal, tvBlueVal, tvAlphaVal;
    View colorView;

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

        //One OnSeekBarChangeListener


        //Check for which seek bar, and update the value
        //Update the view, always done, so can be outside any conditional
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
