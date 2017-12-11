package com.example.daniel.a4155cmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        Button bSanding = findViewById(R.id.bSanding);
        Button bMasking = findViewById(R.id.bMasking);
        Button bPainting = findViewById(R.id.bPainting);
        Button bDetailing = findViewById(R.id.bDetailing);

        bSanding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandingIntent = new Intent(VideoActivity.this, sandingvideo.class);
                VideoActivity.this.startActivity(sandingIntent);

            }
        });

        bMasking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maskingIntent = new Intent(VideoActivity.this, maskingvideo.class);
                VideoActivity.this.startActivity(maskingIntent);

            }
        });

        bPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paintingIntent = new Intent(VideoActivity.this, paintingvideo.class);
                VideoActivity.this.startActivity(paintingIntent);

            }
        });


        bDetailing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailingIntent = new Intent(VideoActivity.this, detailingvideo.class);
                VideoActivity.this.startActivity(detailingIntent);

            }
        });
    }


}
