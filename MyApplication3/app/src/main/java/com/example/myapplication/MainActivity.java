package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    public void play(View view){mediaPlayer.start();}
    public void pause(View view){mediaPlayer.pause();}
    public void stop(View view){mediaPlayer.stop();}

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.garmi);
        SeekBar seekVol = findViewById(R.id.seekVol);

        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        int maxVol = audioManager.getStramMaxVolume(AudioManager.STREAM_MUSIC);
        int curVol = audioManager.getStramVolume(AudioManager.STREAM_MUSIC);

        seekVol.setMax(maxVol);
        seekVol.setProgress(curVol);

    }
}