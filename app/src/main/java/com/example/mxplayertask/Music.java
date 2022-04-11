package com.example.mxplayertask;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Music extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }

    public void play1(View v){
        if(mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(this,R.raw.song1);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        mediaPlayer.start();

    }

    public void pause1(View v){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    public void stop1(View v){
        stopPlayer();

    }


    public void play2(View v){
        if(mediaPlayer == null){
            mediaPlayer = MediaPlayer.create(this,R.raw.song2);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopPlayer();
                }
            });
        }
        mediaPlayer.start();

    }

    public void pause2(View v){
        if(mediaPlayer != null){
            mediaPlayer.pause();
        }
    }

    public void stop2(View v){
        stopPlayer();
    }




    private void stopPlayer(){
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer = null;
            Toast.makeText(this,"Stop Success!",Toast.LENGTH_LONG).show();
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}