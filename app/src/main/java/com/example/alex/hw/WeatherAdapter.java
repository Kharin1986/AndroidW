package com.example.alex.hw;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WeatherAdapter extends RecyclerView.Adapter<ViewHolder> {
    List<DayWeather> dayWeatherList;

    public WeatherAdapter(List<DayWeather> dayWeatherList) {
        this.dayWeatherList = dayWeatherList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DayWeather dayWeather = dayWeatherList.get(position);
        holder.temperature.setText(dayWeather.getTemperature());
    }

    @Override
    public int getItemCount() {
        return dayWeatherList.size();
    }
}
