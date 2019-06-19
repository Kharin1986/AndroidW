package com.example.alex.hw;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class FragmentSelect extends Fragment {
    Button button;
    Spinner spinnerCity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_select,container,false);
        spinnerCity = (Spinner) view.findViewById(R.id.spinner_city);

        button = view.findViewById(R.id.buttonShow);
        button.setOnClickListener(v-> {
            ((CommonData) getActivity()).setCommonData(spinnerCity.getSelectedItem().toString());
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, new FragmentShow())
                    .addToBackStack(FragmentSelect.class.getName())
                    .commit();
        });
        return view;
    }
}
