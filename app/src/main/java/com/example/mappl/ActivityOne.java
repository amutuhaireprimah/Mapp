package com.example.mappl;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityOne extends AppCompatActivity {
    MediaPlayer mediaPlayer;
Button play;
Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        play=findViewById(R.id.playbtn);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.akon);
                mediaPlayer.start();
            }
        });
        stop=findViewById(R.id.btnstop);
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer !=null && mediaPlayer.isPlaying());
                mediaPlayer.stop();
            }

        });
    }
    }

