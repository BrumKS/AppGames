package com.example.games.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.games.R;
import com.example.games.adapter.GamesAdapter;
import com.example.games.controller.GamesDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvGames;
    FloatingActionButton fabAdd;

    GamesDAO gamesDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGames = findViewById(R.id.rvGames);
        fabAdd = findViewById(R.id.fabAdd);

        gamesDAO = new GamesDAO();

        fabAdd.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        rvGames.setLayoutManager(meuLayout);

    }

    @Override
    protected void onResume(){
        super.onResume();

        GamesAdapter meuAdapter = new GamesAdapter(this, gamesDAO);

        rvGames.setAdapter(meuAdapter);
    }
}