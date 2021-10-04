package com.example.games.model;

public class Games {

    private String jogo;
    private String genero;
    private String produtora;
    private String tipo;


    public Games(){
    }

    public Games(String jogo, String genero, String produtora, String tipo){
        this.jogo = jogo;
        this.genero = genero;
        this.produtora = produtora;
        this.tipo = tipo;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) { this.tipo = tipo; }
    }