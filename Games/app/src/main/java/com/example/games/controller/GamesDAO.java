package com.example.games.controller;

import com.example.games.model.Games;

import java.util.ArrayList;
import java.util.List;

public class GamesDAO {

    private static List<Games> listaGames = new ArrayList<>();

    public void addGames (Games f) { listaGames.add(f); }

    public Games getGames(int position){ return listaGames.get(position); }

    public List<Games> getListaGames() { return listaGames; }

}
