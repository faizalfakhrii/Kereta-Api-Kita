package com.example.keretaapikita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.codesgood.views.JustifiedTextView;


public class DetailKeretaActivity extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kereta);
        String namaKereta = "";
        String detailKereta = "";
        String tarifKereta = "";
        Integer fotoKereta;

        if(getIntent().hasExtra("nama_kereta") && getIntent().hasExtra("detail_kereta") && getIntent().hasExtra("tarif_kereta") && getIntent().hasExtra("foto_kereta")){
            namaKereta = getIntent().getStringExtra("nama_kereta");
            detailKereta = getIntent().getStringExtra("detail_kereta");
            tarifKereta = getIntent().getStringExtra("tarif_kereta");
            fotoKereta = getIntent().getIntExtra("foto_kereta", 0);

            JustifiedTextView tvDetail = findViewById(R.id.tv_detail_kereta);
            JustifiedTextView tvTarif = findViewById(R.id.tv_tarif_kereta);
            ImageView imgKereta = findViewById(R.id.foto_kereta);

            tvDetail.setText(detailKereta);
            tvTarif.setText(tarifKereta);
            Glide.with(this).asBitmap().load(fotoKereta).override(300,200).into(imgKereta);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Kereta Api " + namaKereta);

    }
}