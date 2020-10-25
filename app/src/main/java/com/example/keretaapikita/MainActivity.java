package com.example.keretaapikita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKereta;
    private ArrayList<Kereta> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKereta = findViewById(R.id.rv_kereta);
        rvKereta.setHasFixedSize(true);

        list.addAll(DataKereta.getListKereta());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKereta.setLayoutManager(new LinearLayoutManager(this));
        ListKeretaAdapter listKeretaAdapter = new ListKeretaAdapter(list);
        rvKereta.setAdapter(listKeretaAdapter);
    }

    public void showProfile(MenuItem item) {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }
}
