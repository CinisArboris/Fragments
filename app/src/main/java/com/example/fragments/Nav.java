package com.example.fragments;

import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;

public class Nav extends FragmentActivity implements Byfrost{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
    }

    @Override
    public void interface_key_byfrost_enviar(String cadena) {
        Value fvalue = (Value) this.getSupportFragmentManager().findFragmentById(R.id.fragmentValue);

        /*Enlace hacia [value] para enviarle el nuevo [texto] de [key]*/
        fvalue.value_cambiar_text(cadena);
    }
}