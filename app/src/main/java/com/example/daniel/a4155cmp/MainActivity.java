package com.example.daniel.a4155cmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton bPainting = findViewById(R.id.Painting);
        ImageButton bDetailing = findViewById(R.id.Detailing);
        ImageButton bSanding = findViewById(R.id.Sanding);
        ImageButton bMasking = findViewById(R.id.Masking);
        ImageButton bVideo = findViewById(R.id.video);


        bPainting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paintingIntent = new Intent(MainActivity.this, PaintingActivity.class);
                MainActivity.this.startActivity(paintingIntent);

            }
        });

        bDetailing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailingIntent = new Intent(MainActivity.this, Detailing.class);
                MainActivity.this.startActivity(detailingIntent);

            }
        });

        bSanding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandingIntent = new Intent(MainActivity.this, SandingActivity.class);
                MainActivity.this.startActivity(sandingIntent);

            }
        });


        bMasking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maskingIntent = new Intent(MainActivity.this, MaskingActivity.class);
                MainActivity.this.startActivity(maskingIntent);

            }
        });

        bVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent videoIntent = new Intent(MainActivity.this, VideoActivity.class);
                MainActivity.this.startActivity(videoIntent);

            }
        });


    }



}