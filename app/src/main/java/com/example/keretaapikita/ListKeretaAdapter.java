package com.example.keretaapikita;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListKeretaAdapter extends RecyclerView.Adapter<ListKeretaAdapter.ListViewHolder> {
    private ArrayList<Kereta> listKereta;

    public ListKeretaAdapter(ArrayList<Kereta> list){
        this.listKereta = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_kereta, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Kereta kereta = listKereta.get(position);

        Glide.with(holder.itemView.getContext()).load(kereta.getFoto()).apply(new RequestOptions().override(60,60)).into(holder.imgFoto);
        holder.tvNama.setText(kereta.getNama());
        holder.tvDetail.setText(kereta.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailKeretaActivity.class);
                intent.putExtra("nama_kereta", kereta.getNama());
                intent.putExtra("detail_kereta", kereta.getDetail());
                intent.putExtra("tarif_kereta", kereta.getTarif());
                intent.putExtra("foto_kereta", kereta.getFoto());
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listKereta.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.foto_kereta);
            tvNama = itemView.findViewById(R.id.tv_nama_kereta);
            tvDetail = itemView.findViewById(R.id.tv_detail_kereta);
        }
    }

}
