package com.factorymethodpp;

public class NomeSobrenome implements NomeCompleto{
    private String nome;
    private String sobreNome;

    public void armazenarNome(String nome){
        nome = nome.replace("\"", "");
        if(!nome.contains(",")){
            String[] partes = nome.split(" ");
            this.nome = partes[0];
            this.sobreNome = partes[1];
        }
    }
    public String getNome(){
        if(nome != null){
            return this.nome+" "+this.sobreNome;
        }
        return "";
    }
}
