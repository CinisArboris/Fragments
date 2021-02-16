package com.example.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Value extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private TextView text01;/*bryfrost*/

    public Value() { }

    public static Value newInstance(String param1, String param2) {
        Value fragment = new Value(); Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1); args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1); mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_value, container, false);
        this.text01 = view.findViewById(R.id.fragmentValueText);
        return view;
    }

    // I M P L E M E N T A C I O N

    public void value_cambiar_text(String cadena){
        this.text01.setText(cadena);
    }
}