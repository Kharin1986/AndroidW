package com.example.alex.hw;

import java.util.Objects;

public final class DayWeather {
    private String weather;
    private String temperature;

    public DayWeather(String weather, String temperature) {
        this.weather = weather;
        this.temperature = temperature;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "DayWeather{" +
                "weather='" + weather + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayWeather that = (DayWeather) o;
        return Objects.equals(weather, that.weather) &&
                Objects.equals(temperature, that.temperature);
    }

    @Override
    public int hashCode() {

        return Objects.hash(weather, temperature);
    }
}
