package com.example.daniel.a4155cmp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class paintingvideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paintingvideo);

        String fileName = "painting";
        String filePlace = "android.resource://" + getPackageName() + "/raw/" + fileName;
        VideoView videoView = findViewById(R.id.paintingView);
        videoView.setVideoURI(Uri.parse(filePlace));

        videoView.setMediaController(new MediaController(this));

        videoView.start();
    }
}
