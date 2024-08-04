package com.decoratorpp;

public class Colchetes extends NumeroDecorator {
    private ImprimirNumero iNumero;
    public ImprimirNumero getiNumero() {
        return iNumero;
    }
    public void setiNumero(ImprimirNumero iNumero) {
        this.iNumero = iNumero;
    }
    public Colchetes(ImprimirNumero imprimirNumero){
        this.iNumero = imprimirNumero;
    }
    public Colchetes(){}
    public String imprimir(){
        return "["+this.iNumero.imprimir()+"]";
    }
}
