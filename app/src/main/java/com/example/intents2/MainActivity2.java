package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv = findViewById(R.id.tv1);
        Bundle sacRecuperat = getIntent().getExtras();

        String nom = sacRecuperat.getString("Enombre");
        int edad = sacRecuperat.getInt("Eedad");
        tv.setText("Hola "+ nom+" tienes "+edad+" años.");


    }
}