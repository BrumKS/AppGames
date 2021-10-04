package com.example.games.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.games.R;
import com.example.games.controller.GamesDAO;
import com.example.games.model.Games;

public class CadastroActivity extends AppCompatActivity {

    EditText etJogo;
    EditText etGenero;
    EditText etProdutora;
    EditText etTipo;
    Button bSalvar;

    GamesDAO gamesDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etJogo = findViewById(R.id.etJogo);
        etGenero = findViewById(R.id.etGenero);
        etProdutora = findViewById(R.id.etProdutora);
        etTipo = findViewById(R.id.etTipo);
        bSalvar = findViewById(R.id.bSalvar);

        gamesDAO = new GamesDAO();

        bSalvar.setOnClickListener(v -> {

            if ( etJogo.getText().toString().isEmpty() ||
                    etGenero.getText().toString().isEmpty() ||
                    etProdutora.getText().toString().isEmpty() ||
                    etTipo.getText().toString().isEmpty())
            {
                Toast.makeText(this, "PREENCHA OS CAMPOS OBRIGATÓRIOS", Toast.LENGTH_SHORT).show();
            } else {

                Games games = new Games(
                        etJogo.getText().toString(),
                        etGenero.getText().toString(),
                        etProdutora.getText().toString(),
                        etTipo.getText().toString());

                gamesDAO.addGames(games);

                Toast.makeText(this, "GAME CADASTRADO!", Toast.LENGTH_SHORT).show();

                finish();
            }
        });

    }
}