package com.factorymethodpp;

public class NomeSobrenomeFactory extends FactoryConstrutorNomes {
    public NomeCompleto criarNome(String nome){
        NomeCompleto nCompleto = new NomeSobrenome();
        nCompleto.armazenarNome(nome);
        return nCompleto;
    }
}
