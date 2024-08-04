package com.factorymethodpp;

public class SobrenomeNome implements NomeCompleto{
    private String nome;
    private String sobreNome;

    public void armazenarNome(String nome){
        nome = nome.replace("\"", "");
        if(nome.contains(",")){
            String[] partes = nome.split(", ");
            this.nome = partes[1];
            this.sobreNome = partes[0];
        }
    }
    public String getNome(){
        if(nome != null){
            return this.nome+" "+this.sobreNome;
        }
        return "";
    }
}
