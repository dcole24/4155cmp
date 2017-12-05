package com.example.daniel.a4155cmp;



import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;


public class PaintingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        final CheckBox checkBox = findViewById(R.id.CheckBox_Painting);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }




    }

    @Override
    public void onPause() {
        super.onPause();
        final CheckBox checkBox = findViewById(R.id.CheckBox_Painting);
        save(checkBox.isChecked());
    }

    @Override
    public void onResume() {
        super.onResume();
        final CheckBox checkBox = findViewById(R.id.CheckBox_Painting);
        checkBox.setChecked(load());
    }

    private void save(final boolean isChecked) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("check", isChecked);
        editor.commit();
    }

    private boolean load() {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("check", false);
    }
}
