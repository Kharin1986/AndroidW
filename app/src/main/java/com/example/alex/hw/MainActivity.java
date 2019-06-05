package com.example.alex.hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

import static android.provider.Telephony.Mms.Part.TEXT;

public class MainActivity extends AppCompatActivity {
    Button button;
    Spinner spinnerCity;
    CheckBox showChartCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showChartCheckBox = (CheckBox) findViewById(R.id.checkBox);
        button = findViewById(R.id.buttonShow);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ShowWeatherActivity.class);
            intent.putExtra(TEXT, showChartCheckBox.isChecked());  // Получить значение из чекбокса
            startActivity(intent);
            finish();
        });
        spinnerCity = findViewById(R.id.spinner_city);
        spinnerCity.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new String[]{
                getString(R.string.select_city),
                getString(R.string.Moscow),
                getString(R.string.St_Petersburg),
                getString(R.string.Yekaterinburg)
        }));
    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    private void log(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
        Log.d("MA", string);
    }
}
