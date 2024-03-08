package com.example.lyrapaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Tombol Bunga
        Button bungaButton = findViewById(R.id.bunga_button);
        bungaButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, bungaActivity.class));
            }
        });

// Tombol Skincare
        Button skincareButton = findViewById(R.id.skincare_button);
        skincareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, skincareActivity.class));
            }
        });

// Tombol Boneka
        Button bonekaButton = findViewById(R.id.boneka_button);
        bonekaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, bonekaActivity.class));
            }
        });

    }
}