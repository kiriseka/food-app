package com.bsoandroid.foodapp;

import android.content.Context;

import java.util.ArrayList;

public class MakananData {
    public static ArrayList<Makanan> getData(Context context) {
        ArrayList<Makanan> list = new ArrayList<Makanan>();
        list.add(new Makanan("Batagor", "Batagor dibuat dari tahu yang dilembutkan dan diisi dengan adonan berbahan ikan tenggiri dan tepung tapioka lalu dibentuk menyerupai bola yang digoreng dalam minyak panas selama beberapa menit hingga matang.", 6000, context.getDrawable(R.drawable.batagor)));
        list.add(new Makanan("Black Salad", "Selada (bahasa Belanda: Salade; bahasa Inggris: Salad) adalah jenis makanan yang terdiri dari campuran sayur-sayuran dan bahan-bahan makanan siap santap", 5000, context.getDrawable(R.drawable.black_salad)));
        list.add(new Makanan("Caphuchino", "Kapucino adalah minuman khas Italia yang dibuat dari espreso dan susu, tetapi referensi lain juga ada yang menyebutkan bahwa kapucino berawal dari biji biji kopi tentara Turki yang tertinggal setelah peperangan yang di pimpin oleh Kara Mustapha Pasha di Wina, Austria melawan tentara gabungan Polandia-Germania. ", 15000, context.getDrawable(R.drawable.cappuchino)));
        list.add(new Makanan("Cheesecake", "Cheesecake adalah kue yang biasanya dimakan sebagai hidangan penutup, dibuat dengan mencampurkan keju yang bertekstur lembut, telur, susu, dan gula.", 25000, context.getDrawable(R.drawable.cheesecake)));
        return list;
    }
}
