package com.example.games.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.games.R;

public class GamesViewHolder extends RecyclerView.ViewHolder {

    TextView tvJogo;
    TextView tvGenero;
    TextView tvProdutora;
    TextView tvTipo;

    public GamesViewHolder(@NonNull View itemView){
        super(itemView);

        tvJogo = itemView.findViewById(R.id.tvJogo);
        tvGenero = itemView.findViewById(R.id.tvGenero);
        tvProdutora = itemView.findViewById(R.id.tvProdutora);
        tvTipo = itemView.findViewById(R.id.tvTipo);
    }
}
