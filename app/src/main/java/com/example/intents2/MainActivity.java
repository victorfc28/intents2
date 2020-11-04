package com.example.intents2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et1;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=findViewById(R.id.bt1);
        et1 = findViewById(R.id.Et1);
        et2 = findViewById(R.id.Et2);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //recuperamos valor del edit text y lo enviamos a la actividad 2
        String nom = et1.getText().toString();
        int edad = Integer.parseInt(et2.getText().toString());

        Intent intent = new Intent(this,MainActivity2.class);
        //intent.putExtra("Etiquetanom",nom);
        Bundle sac = new Bundle();
        sac.putString("Enombre",nom);
        sac.putInt("Eedad",edad);
        intent.putExtras(sac);
        startActivity(intent);
    }
}