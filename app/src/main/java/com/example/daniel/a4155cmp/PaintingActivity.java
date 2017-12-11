package com.example.daniel.a4155cmp;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.VideoView;


public class PaintingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        Button video1 = findViewById(R.id.playVideo1);

        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paintingIntent = new Intent(PaintingActivity.this, paintingvideo.class);
                PaintingActivity.this.startActivity(paintingIntent);

            }
        });


        CheckBox checkBox = findViewById(R.id.CheckBox_Painting);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }

        CheckBox checkBox2 = findViewById(R.id.CheckBox_Painting2);
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        CheckBox checkBox3 = findViewById(R.id.CheckBox_Painting3);
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }

        CheckBox checkBox4 = findViewById(R.id.CheckBox_Painting4);
        if (checkBox4.isChecked()) {
            checkBox4.setChecked(false);
        }

        CheckBox checkBox5 = findViewById(R.id.CheckBox_Painting5);
        if (checkBox5.isChecked()) {
            checkBox5.setChecked(false);
        }

        CheckBox checkBox6 = findViewById(R.id.checkBox_Painting6);
        if (checkBox6.isChecked()) {
            checkBox6.setChecked(false);
        }

    }



    @Override
    public void onPause() {
        super.onPause();
        CheckBox checkBoxP = findViewById(R.id.CheckBox_Painting);
        save(checkBoxP.isChecked(), "checkBoxP");

        CheckBox checkBoxP2 = findViewById(R.id.CheckBox_Painting2);
        save(checkBoxP2.isChecked(), "checkBoxP2");

        CheckBox checkBoxP3 = findViewById(R.id.CheckBox_Painting3);
        save(checkBoxP3.isChecked(), "checkBoxP3");

        CheckBox checkBoxP4 = findViewById(R.id.CheckBox_Painting4);
        save(checkBoxP4.isChecked(), "checkBoxP4");

        CheckBox checkBoxP5 = findViewById(R.id.CheckBox_Painting5);
        save(checkBoxP5.isChecked(), "checkBoxP5");

        CheckBox checkBoxP6 = findViewById(R.id.checkBox_Painting6);
        save(checkBoxP6.isChecked(), "checkBoxP6");

    }

    @Override
    public void onResume() {
        super.onResume();
        CheckBox checkBoxR = findViewById(R.id.CheckBox_Painting);
        checkBoxR.setChecked(load("checkBoxP"));

        CheckBox checkBoxR2 = findViewById(R.id.CheckBox_Painting2);
        checkBoxR2.setChecked(load("checkBoxP2"));

        CheckBox checkBoxR3 = findViewById(R.id.CheckBox_Painting3);
        checkBoxR3.setChecked(load("checkBoxP3"));

        CheckBox checkBoxR4 = findViewById(R.id.CheckBox_Painting4);
        checkBoxR4.setChecked(load("checkBoxP4"));

        CheckBox checkBoxR5 = findViewById(R.id.CheckBox_Painting5);
        checkBoxR5.setChecked(load("checkBoxP5"));

        CheckBox checkBoxR6 = findViewById(R.id.checkBox_Painting6);
        checkBoxR6.setChecked(load("checkBoxP6"));

    }

    private void save(final boolean isChecked, String key) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, isChecked);
        editor.apply();
    }

    private boolean load(String key) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, false);
    }



//        Button videoBtn = findViewById(R.id.videoButton);

    //        videoBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                VideoView vView = findViewById(R.id.myVideo);
//                String path = "android.resource://" + getPackageName() + "/" + R.raw.painting;
//
//                vView.setVideoURI(Uri.parse(path));
//                vView.start();
//            }
    // });
}
