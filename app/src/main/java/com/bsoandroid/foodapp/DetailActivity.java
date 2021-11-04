package com.bsoandroid.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int id = getIntent().getIntExtra("id", -1);

        ArrayList<Makanan> list = MakananData.getData(getApplicationContext());
        Makanan makanan = list.get(id);

        if (makanan != null) {
            TextView tvJudul = findViewById(R.id.detail_judul);
            TextView tvHarga = findViewById(R.id.detail_harga);
            TextView tvDeskripsi = findViewById(R.id.detail_deskripsi);
            ImageView image = findViewById(R.id.detail_photo);

            image.setImageDrawable(makanan.image);
            tvJudul.setText(makanan.judul);
            tvHarga.setText(String.valueOf(makanan.harga));
            tvDeskripsi.setText(makanan.deskripsi);
        }
    }
}