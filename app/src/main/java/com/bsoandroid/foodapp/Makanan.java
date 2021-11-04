package com.bsoandroid.foodapp;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;

import java.io.File;

public class Makanan {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;

    Makanan(String judul, String deskripsi, int harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}
