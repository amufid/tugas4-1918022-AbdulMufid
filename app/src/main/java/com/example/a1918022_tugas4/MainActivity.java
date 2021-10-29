package com.example.a1918022_tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ElektronikAdapter adapter;
    private ArrayList<Elektronik> elektronikArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        adapter = new ElektronikAdapter(elektronikArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager((layoutManager));
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        elektronikArrayList = new ArrayList<>();
        elektronikArrayList.add(new Elektronik("Laptop Hp Pavilion", "Harga : Rp.15.000.000", "Lokasi Toko : Surabaya",R.drawable.laptop));
        elektronikArrayList.add(new Elektronik("Keyboard Mechanical", "Harga : Rp.350.000", "Lokasi Toko : Malang",R.drawable.keyboard));
        elektronikArrayList.add(new Elektronik("Mouse Logika", "Harga : Rp.250.000", "Lokasi Toko : Jakarta",R.drawable.mouse));
        elektronikArrayList.add(new Elektronik("Coollingpad", "Harga : Rp.199.000", "Lokasi Toko : Surabaya",R.drawable.cpad));
        elektronikArrayList.add(new Elektronik("Cas Laptop", "Harga : Rp.400.000", "Lokasi Toko : Pasuruan",R.drawable.cas));
        elektronikArrayList.add(new Elektronik("Mousepad Robotik", "Harga : Rp.50.000", "Lokasi Toko : Blitar",R.drawable.mpad));
    }
}