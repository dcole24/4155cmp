package com.example.daniel.a4155cmp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class maskingvideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maskingvideo);

        String fileName = "masking";
        String filePlace = "android.resource://" + getPackageName() + "/raw/" + fileName;
        VideoView videoView = findViewById(R.id.maskingView);
        videoView.setVideoURI(Uri.parse(filePlace));

        videoView.setMediaController(new MediaController(this));

        videoView.start();
    }
}
