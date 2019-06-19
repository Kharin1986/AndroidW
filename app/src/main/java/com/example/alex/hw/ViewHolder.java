package com.example.alex.hw;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alex.hw.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView temperature;
    ImageView sun;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        temperature=itemView.findViewById(R.id.text_temperature);
        sun=itemView.findViewById(R.id.iv_sun);
    }
}
