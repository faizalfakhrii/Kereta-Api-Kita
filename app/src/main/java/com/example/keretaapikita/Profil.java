package com.example.keretaapikita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Profil extends AppCompatActivity {

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Profil");
    }
}