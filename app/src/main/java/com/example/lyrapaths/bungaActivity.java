package com.example.lyrapaths;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class bungaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunga);

        // Tulip
        Button bunga_button1 = findViewById(R.id.bunga_button1);
        bunga_button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(bungaActivity.this, DetailActivity.class));
            }
        });

        // Matahari
        Button bunga_button2 = findViewById(R.id.bunga_button2);
        bunga_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bungaActivity.this, DetailActivity.class));
            }
        });

        // Mawar
        Button bunga_button3 = findViewById(R.id.bunga_button3);
        bunga_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bungaActivity.this, DetailActivity.class));
            }
        });

        // Melati
        Button bunga_button4 = findViewById(R.id.bunga_button4);
        bunga_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bungaActivity.this, DetailActivity.class));
            }
        });

        // Anggrek
        Button bunga_button5 = findViewById(R.id.bunga_button5);
        bunga_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bungaActivity.this, DetailActivity.class));
            }
        });
    }
}


