package com.example.games.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.games.R;
import com.example.games.controller.GamesDAO;
import com.example.games.model.Games;

import java.util.List;

public class GamesAdapter extends RecyclerView.Adapter {

    private Context context;
    private GamesDAO gamesDAO;

    public GamesAdapter(Context context, GamesDAO gamesDAO){
        this.context = context;
        this.gamesDAO = gamesDAO;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View viewGame = LayoutInflater.from(context).inflate(R.layout.layout_games, parent, false);

        GamesViewHolder gamesViewHolder = new GamesViewHolder(viewGame);

        return gamesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        GamesViewHolder gamesViewHolder = (GamesViewHolder) holder;

        Games f = gamesDAO.getGames(position);
        gamesViewHolder.tvJogo.setText(f.getJogo());
        gamesViewHolder.tvGenero.setText("Gênero: " + f.getGenero());
        gamesViewHolder.tvProdutora.setText("Produtora: " + f.getProdutora());
        gamesViewHolder.tvTipo.setText("Tipo: " + f.getTipo());
    }

    @Override
    public int getItemCount() {
        return gamesDAO.getListaGames().size();
    }
}