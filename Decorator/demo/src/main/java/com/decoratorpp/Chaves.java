package com.decoratorpp;

public class Chaves extends NumeroDecorator{
    private ImprimirNumero iNumero;

    public ImprimirNumero getiNumero() {
        return iNumero;
    }
    public void setiNumero(ImprimirNumero iNumero) {
        this.iNumero = iNumero;
    }
    public Chaves(ImprimirNumero imprimirNumero){
        this.iNumero = imprimirNumero;
    }
    public Chaves(){}
    public String imprimir(){
        return "{"+this.iNumero.imprimir()+"}";
    }
}
