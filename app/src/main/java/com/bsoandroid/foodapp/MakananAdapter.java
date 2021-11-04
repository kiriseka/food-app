package com.bsoandroid.foodapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ListViewHolder> {
    private ArrayList<Makanan> makananData;

    MakananAdapter(ArrayList<Makanan> list) {
        this.makananData = list;
    }

    @NonNull
    @Override
    public MakananAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_makanan, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ListViewHolder holder, int position) {
        Makanan makanan = makananData.get(position);
        holder.judul.setText(makanan.judul);
        holder.harga.setText(String.valueOf(makanan.harga));
        holder.image.setBackground(makanan.image);
        holder.image.setImageDrawable(makanan.image);
    }

    @Override
    public int getItemCount() {
        return makananData.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView image;
        public TextView judul, harga;
        public ListViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_photo);
            judul = itemView.findViewById(R.id.food_name);
            harga = itemView.findViewById(R.id.food_price);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int selected = getLayoutPosition();
            Intent intent = new Intent(view.getContext(), DetailActivity.class);
            intent.putExtra("id", selected);
            view.getContext().startActivity(intent);
        }
    }
}
