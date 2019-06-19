package com.example.alex.hw;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentShow extends Fragment {
    Button button;
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show,container,false);
        textView=view.findViewById(R.id.city);
        textView.setText(((MainActivity) getActivity()).getCommonData());
        button = view.findViewById(R.id.buttonToMenu);
        button.setOnClickListener(v->getFragmentManager().beginTransaction()
                .replace(R.id.container,new FragmentSelect())
                .commit());
        return view;
    }
}

