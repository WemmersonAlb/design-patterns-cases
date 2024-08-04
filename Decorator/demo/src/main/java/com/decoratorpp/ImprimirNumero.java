package com.decoratorpp;

public abstract class ImprimirNumero {
    private String numero;
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public abstract String imprimir();
    
}
