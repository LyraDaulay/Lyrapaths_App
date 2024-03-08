package com.example.lyrapaths;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button shareTulipButton = findViewById(R.id.share_tulip);

        shareTulipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengatur nama dan deskripsi barang
                String namaBarang = "Bunga Tulip (Rp.6.000,00)";
                String deskripsiBarang = "Tullip Holland, Berbagai warna (Pink, Putih,dll), Kondisi Bunga Segar dan Berkualitas";

                // Menggabungkan nama dan deskripsi barang menjadi satu pesan
                String shareMessage = namaBarang + "\n" + deskripsiBarang;

                // Membuat intent untuk berbagi
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                // Memulai aktivitas berbagi
                startActivity(Intent.createChooser(shareIntent, "Bagikan ke:"));

            }
        });
    }
}







