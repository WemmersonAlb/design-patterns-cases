package com.factorymethodpp;

public class SobrenomeNomeFactory extends FactoryConstrutorNomes{
    public NomeCompleto criarNome(String nome){
        NomeCompleto nCompleto = new SobrenomeNome();
        nCompleto.armazenarNome(nome);
        return nCompleto;
    }
}
