package com.example.alex.hw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.provider.Telephony.Mms.Part.TEXT;

public class ShowWeatherActivity extends AppCompatActivity {
    ImageView chart1;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_weather);
        Boolean showChart = getIntent().getExtras().getBoolean(TEXT);
        chart1 = findViewById(R.id.chart);
        if (showChart) {
            chart1.setVisibility(View.VISIBLE);
        } else chart1.setVisibility(View.INVISIBLE);
        button = findViewById(R.id.buttonBack);
        button.setOnClickListener(view -> {
            startActivity(new Intent(ShowWeatherActivity.this, MainActivity.class));
            finish();
        });
    }
}
