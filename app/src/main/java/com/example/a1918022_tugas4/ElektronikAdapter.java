package com.example.a1918022_tugas4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElektronikAdapter extends RecyclerView.Adapter<ElektronikAdapter.ElektronikViewHolder> {
    private ArrayList<Elektronik> dataList;
    public ElektronikAdapter(ArrayList<Elektronik> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ElektronikAdapter.ElektronikViewHolder
    onCreateViewHolder(@NonNull
    ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_barang, parent, false);
        return new ElektronikViewHolder(view);
    }
    public void onBindViewHolder(ElektronikViewHolder holder, int position) {
        holder.Gambar.setImageResource(dataList.get(position).getGambar());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtHarga.setText(dataList.get(position).getHarga());
        holder.txtKota.setText(dataList.get(position).getKota());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ElektronikViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtHarga, txtKota;
        private ImageView Gambar;
        public ElektronikViewHolder(View itemView) {
            super(itemView);
            Gambar = (ImageView) itemView.findViewById(R.id.gambar);
            txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
            txtHarga = (TextView) itemView.findViewById(R.id.txt_harga);
            txtKota = (TextView) itemView.findViewById(R.id.txt_kota);
        }
    }

}
