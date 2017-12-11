package com.example.daniel.a4155cmp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class SandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanding);

        Button video2 = findViewById(R.id.playVideo2);

        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sandvidIntent = new Intent(SandingActivity.this, sandingvideo.class);
               SandingActivity.this.startActivity(sandvidIntent);

            }
        });

        CheckBox checkBox = findViewById(R.id.CheckBox_Sanding1);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }

        CheckBox checkBox2 = findViewById(R.id.CheckBox_Sanding2);
        if(checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        CheckBox checkBox3 = findViewById(R.id.CheckBox_Sanding3);
        if(checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }

        CheckBox checkBox4 = findViewById(R.id.CheckBox_Sanding4);
        if(checkBox4.isChecked()) {
            checkBox4.setChecked(false);
        }

        CheckBox checkBox5 = findViewById(R.id.CheckBox_Sanding5);
        if(checkBox5.isChecked()) {
            checkBox5.setChecked(false);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        CheckBox checkBox = findViewById(R.id.CheckBox_Sanding1);
        save(checkBox.isChecked(), "checkBox");

        CheckBox checkBox2 = findViewById(R.id.CheckBox_Sanding2);
        save(checkBox2.isChecked(), "checkBox2");

        CheckBox checkBox3 = findViewById(R.id.CheckBox_Sanding3);
        save(checkBox3.isChecked(), "checkBox3");

        CheckBox checkBox4 = findViewById(R.id.CheckBox_Sanding4);
        save(checkBox4.isChecked(), "checkBox4");

        CheckBox checkBox5 = findViewById(R.id.CheckBox_Sanding5);
        save(checkBox5.isChecked(), "checkBox5");

    }

    @Override
    public void onResume() {
        super.onResume();
        CheckBox checkBox = findViewById(R.id.CheckBox_Sanding1);
        checkBox.setChecked(load("checkBox"));

        CheckBox checkBox2 = findViewById(R.id.CheckBox_Sanding2);
        checkBox2.setChecked(load("checkBox2"));

        CheckBox checkBox3 = findViewById(R.id.CheckBox_Sanding3);
        checkBox3.setChecked(load("checkBox3"));

        CheckBox checkBox4 = findViewById(R.id.CheckBox_Sanding4);
        checkBox4.setChecked(load("checkBox4"));

        CheckBox checkBox5 = findViewById(R.id.CheckBox_Sanding5);
        checkBox5.setChecked(load("checkBox5"));
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
