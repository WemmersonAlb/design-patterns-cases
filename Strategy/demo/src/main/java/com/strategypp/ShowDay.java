package com.strategypp;

public class ShowDay {
    DiaDaSemana dia;

    
    public ShowDay(){}
    
    public ShowDay(DiaDaSemana d){
        this.dia = d;
    }
    
    public ShowDay(String d){
        this.setDiaSemanaWithString(d);
    }
    
    public String showDay(){
        return this.dia.diaSemana();
    }
    
    public void setDiaSemanaWithString(String d){
        switch (d) {
            case "Domingo":
            this.dia = new Domingo();
            break;
            case "Segunda":
            this.dia = new Segunda();
            break;
            case "Terça":
            this.dia = new Terca();
            break;
            case "Quarta":
            this.dia = new Quarta();
            break;
            case "Quinta":
            this.dia = new Quinta();
            break;
            case "Sexta":
            this.dia = new Sexta();
            break;
            case "Sábado":
            this.dia = new Sabado();
            break;
            default:
            break;
        }
    }
    public DiaDaSemana getDia() {
        return dia;
    }
    
    public void setDia(DiaDaSemana dia) {
        this.dia = dia;
    }
}
