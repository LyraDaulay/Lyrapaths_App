package com.example.lyrapaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class bonekaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boneka);

        // Teddy
        Button boneka_button1 = findViewById(R.id.boneka_button1);
        boneka_button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(bonekaActivity.this, DetailActivity.class));
            }
        });

        // Rabbit
        Button boneka_button2 = findViewById(R.id.boneka_button2);
        boneka_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bonekaActivity.this, DetailActivity.class));
            }
        });

        // Stitch
        Button boneka_button3 = findViewById(R.id.boneka_button3);
        boneka_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bonekaActivity.this, DetailActivity.class));
            }
        });

        // Bird
        Button boneka_button4 = findViewById(R.id.boneka_button4);
        boneka_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bonekaActivity.this, DetailActivity.class));
            }
        });

        // Doraemon
        Button boneka_button5 = findViewById(R.id.boneka_button5);
        boneka_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bonekaActivity.this, DetailActivity.class));
            }
        });
    }
}