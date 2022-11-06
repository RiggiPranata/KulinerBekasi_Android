package com.example.uts252;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    ToggleButton myToggle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToggle = (ToggleButton) findViewById(R.id.toggleMusik);

        mp = MediaPlayer.create(this, R.raw.kriuk);
        mp.setLooping(true);
        mp.setVolume(1,1);
        mp.start();
    }

    public void openGabus(View v){
        Intent i = new Intent(this, gabusActivity.class);
        startActivity(i);
    }

    public void openBandeng(View v){
        Intent i = new Intent(this, bandengActivity.class);
        startActivity(i);
    }

    public void openKue(View v){
        Intent i = new Intent(this, kueActivity.class);
        startActivity(i);
    }

    public void play(View v){
        boolean on = ((ToggleButton) v).isChecked();

        if(on){
            mp.setVolume(0,0);
            mp.pause();
        }else{
            mp.setVolume(1,1);
            mp.start();
        }
    }
}