package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Novatela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novatela);

        Bundle params = getIntent().getExtras();
        String s = params.getString("nomesusuario");
        Float f = params.getFloat("val1");
        System.out.println(s+" "+f);
    }
}