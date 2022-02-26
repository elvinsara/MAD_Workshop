package com.workshop.vedioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.vedio);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.hridayam);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
