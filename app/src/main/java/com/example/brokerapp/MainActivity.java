package com.example.brokerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGrafica = findViewById(R.id.button_grafica);
        btnGrafica.setOnClickListener(v -> {
            Intent intent = new Intent(this, GraficaActivity.class);
            startActivity(intent);
        });

    }
}