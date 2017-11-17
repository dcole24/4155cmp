package com.example.daniel.a4155cmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bPainting = findViewById(R.id.Painting);
        Button bDetailing = findViewById(R.id.Detailing);


        bPainting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
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



    }
}
