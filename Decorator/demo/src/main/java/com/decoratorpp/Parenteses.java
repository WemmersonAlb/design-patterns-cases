package com.decoratorpp;

public class Parenteses extends NumeroDecorator{
    private ImprimirNumero iNumero;
    public ImprimirNumero getiNumero() {
        return iNumero;
    }
    public void setiNumero(ImprimirNumero iNumero) {
        this.iNumero = iNumero;
    }
    public Parenteses(ImprimirNumero imprimirNumero){
        this.iNumero = imprimirNumero;
    }
    public Parenteses(){}
    public String imprimir(){
        return "("+this.iNumero.imprimir()+")";
    }
}
