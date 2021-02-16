package com.example.fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Key extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private Button button01;/*byfrost*/
    private EditText edit01;/*byfrost*/
    private Byfrost heimdal;/*byfrost*/

    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        /*Recibe lo que haya implementado [Nav]*/
        /*En este caso : fvalue.value_cambiar_text(cadena);*/
        heimdal = (Byfrost) context;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_key, container, false);

        this.button01 = view.findViewById(R.id.fragmentKeyButton);
        this.edit01 = view.findViewById(R.id.fragmentKeyEdit);

        this.button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Envio el contenido de [key_edit01] hacia el destino que tenga [nav]*/
                /*por referencia*/
                /*Estoy gracias al onAttach que me trajo la función.*/
                heimdal.interface_key_byfrost_enviar(
                        edit01.getText().toString()
                );
            }
        });

        return view;
    }

    // B A S U R A

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    public Key() {}
    public static Key newInstance(String param1, String param2) {
        Key fragment = new Key();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

}