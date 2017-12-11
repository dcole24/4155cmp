package com.example.daniel.a4155cmp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Detailing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailing);

        Button video4 = findViewById(R.id.playVideo4);

        video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailingVidIntent = new Intent(Detailing.this, detailingvideo.class);
                Detailing.this.startActivity(detailingVidIntent);

            }
        });

        CheckBox checkBox = findViewById(R.id.checkBox1);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }

        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }

        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        if (checkBox4.isChecked()) {
            checkBox4.setChecked(false);
        }

        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        if (checkBox5.isChecked()) {
            checkBox5.setChecked(false);
        }

        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        if (checkBox6.isChecked()) {
            checkBox6.setChecked(false);
        }

        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        if (checkBox7.isChecked()) {
            checkBox7.setChecked(false);
        }

        CheckBox checkBox8 = findViewById(R.id.checkBox8);
        if (checkBox8.isChecked()) {
            checkBox8.setChecked(false);
        }

        CheckBox checkBox9 = findViewById(R.id.checkBox9);
        if (checkBox9.isChecked()) {
            checkBox9.setChecked(false);
        }

        CheckBox checkBox10 = findViewById(R.id.checkBox10);
        if (checkBox10.isChecked()) {
            checkBox10.setChecked(false);
        }

        CheckBox checkBox11 = findViewById(R.id.checkBox11);
        if (checkBox11.isChecked()) {
            checkBox11.setChecked(false);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        CheckBox checkBox = findViewById(R.id.checkBox1);
        save(checkBox.isChecked(), "checkBox");

        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        save(checkBox2.isChecked(), "checkBox2");

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        save(checkBox3.isChecked(), "checkBox3");

        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        save(checkBox4.isChecked(), "checkBox4");

        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        save(checkBox5.isChecked(),"checkBox5");

        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        save(checkBox6.isChecked(), "checkBox6");

        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        save(checkBox7.isChecked(), "checkBox7");

        CheckBox checkBox8 = findViewById(R.id.checkBox8);
        save(checkBox8.isChecked(), "checkBox8");

        CheckBox checkBox9 = findViewById(R.id.checkBox9);
        save(checkBox9.isChecked(), "checkBox9");

        CheckBox checkBox10 = findViewById(R.id.checkBox10);
        save(checkBox10.isChecked(), "checkBox10");

        CheckBox checkBox11 = findViewById(R.id.checkBox11);
        save(checkBox11.isChecked(), "checkBox11");

    }

    @Override
    public void onResume() {
        super.onResume();
        CheckBox checkBox = findViewById(R.id.checkBox1);
        checkBox.setChecked(load("checkBox"));

        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        checkBox2.setChecked(load("checkBox2"));

        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        checkBox3.setChecked(load("checkBox3"));

        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        checkBox4.setChecked(load("checkBox4"));

        CheckBox checkBox5 = findViewById(R.id.checkBox5);
        checkBox5.setChecked(load("checkBox5"));

        CheckBox checkBox6 = findViewById(R.id.checkBox6);
        checkBox6.setChecked(load("checkBox6"));

        CheckBox checkBox7 = findViewById(R.id.checkBox7);
        checkBox7.setChecked(load("checkBox7"));

        CheckBox checkBox8 = findViewById(R.id.checkBox8);
        checkBox8.setChecked(load("checkBox8"));

        CheckBox checkBox9 = findViewById(R.id.checkBox9);
        checkBox9.setChecked(load("checkBox9"));

        CheckBox checkBox10 = findViewById(R.id.checkBox10);
        checkBox10.setChecked(load("checkBox10"));

        CheckBox checkBox11 = findViewById(R.id.checkBox11);
        checkBox11.setChecked(load("checkBox11"));

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
}
