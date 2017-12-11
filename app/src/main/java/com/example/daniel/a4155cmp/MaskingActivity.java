package com.example.daniel.a4155cmp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MaskingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masking);

        Button video3 = findViewById(R.id.playVideo3);

        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maskingVidIntent = new Intent(MaskingActivity.this, maskingvideo.class);
                MaskingActivity.this.startActivity(maskingVidIntent);

            }
        });

        final CheckBox checkBox = findViewById(R.id.CheckBox_Masking);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }

        final CheckBox checkBox2 = findViewById(R.id.CheckBox_Masking2);
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        final CheckBox checkBox3 = findViewById(R.id.CheckBox_Masking3);
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }

        final CheckBox checkBox4 = findViewById(R.id.CheckBox_Masking4);
        if (checkBox4.isChecked()) {
            checkBox4.setChecked(false);
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        final CheckBox checkBox = findViewById(R.id.CheckBox_Masking);
        save(checkBox.isChecked(), "checkBox");

        final CheckBox checkBox2 = findViewById(R.id.CheckBox_Masking2);
        save(checkBox2.isChecked(), "checkBox2");

        final CheckBox checkBox3 = findViewById(R.id.CheckBox_Masking3);
        save(checkBox3.isChecked(), "checkBox3");

        final CheckBox checkBox4 = findViewById(R.id.CheckBox_Masking4);
        save(checkBox4.isChecked(), "checkBox4");
    }

    @Override
    public void onResume() {
        super.onResume();
        final CheckBox checkBox = findViewById(R.id.CheckBox_Masking);
        checkBox.setChecked(load("checkBox"));

        final CheckBox checkBox2 = findViewById(R.id.CheckBox_Masking2);
        checkBox2.setChecked(load("checkBox2"));

        final CheckBox checkBox3 = findViewById(R.id.CheckBox_Masking3);
        checkBox3.setChecked(load("checkBox3"));

        final CheckBox checkBox4 = findViewById(R.id.CheckBox_Masking4);
        checkBox4.setChecked(load("checkBox4"));
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
