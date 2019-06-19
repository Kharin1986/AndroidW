package com.example.alex.hw;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity implements CommonData{
    String commonData; // выбирается в спиннере FragmentSelect
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new WeatherAdapter(generateWeather()));
        if(savedInstanceState==null) { // активити создано первый раз и не переворачивалось
            // (чтобы при повороте фрагмент не создавался дополнительно)
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new FragmentSelect())
                    .commit();
        }
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
        outState.putString("city", this.getCommonData());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        log(savedInstanceState.getString("city"));
        setCommonData(savedInstanceState.getString("city"));
    }

    private void log(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
        Log.d("MA", string);
    }

    @Override
    public void setCommonData(String commonData) {
        this.commonData=commonData;
    }

    @Override
    public String getCommonData() {
        return commonData;
    }
    private static List<DayWeather> generateWeather(){
        List<DayWeather> dayWeather = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dayWeather.add(new DayWeather("20",String.valueOf(i+10)));
        }
        return dayWeather;
    }
}
