package com.example.lyrapaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class skincareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skincare);

        // Facemask
        Button skincare_button1 = findViewById(R.id.skincare_button1);
        skincare_button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(skincareActivity.this, DetailActivity.class));
            }
        });

        // Facewash
        Button skincare_button2 = findViewById(R.id.skincare_button2);
        skincare_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(skincareActivity.this, DetailActivity.class));
            }
        });

        // Serum
        Button skincare_button3 = findViewById(R.id.skincare_button3);
        skincare_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(skincareActivity.this, DetailActivity.class));
            }
        });

        // Sunscreen
        Button skincare_button4 = findViewById(R.id.skincare_button4);
        skincare_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(skincareActivity.this, DetailActivity.class));
            }
        });

        // Lipbalm
        Button skincare_button5 = findViewById(R.id.skincare_button5);
        skincare_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(skincareActivity.this, DetailActivity.class));
            }
        });
    }
}