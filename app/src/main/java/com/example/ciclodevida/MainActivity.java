package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Novatela.class);
                Bundle params = new Bundle();
                String s = "victor";
                params.putString("nomeusuario",s);
                params.putFloat("val1", 43.5f);
                params.putInt("val2", 2);
                i.putExtras(params);
                startActivity(i);
            }

        });
    }
}