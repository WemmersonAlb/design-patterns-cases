package com.observerpp;

import java.util.ArrayList;

public class Sensor implements SubjectSensor{
    private ArrayList<ObserverSensor> observers = new ArrayList<>();

    private String nome;
    private Boolean estadoDisparado = false;

    public Sensor(){}
    public Sensor(String nome){
        this.nome = nome;
    }

    //observer
    public void registerObserver(ObserverSensor o){
        this.observers.add(o);
    }
    public void removeObserver(ObserverSensor o){
        this.observers.remove(o);
    }
    public void notifyObservers(){
        for(ObserverSensor o: observers){
            o.update(nome, estadoDisparado);
        }
    }

    //sets e gets
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
        notifyObservers(); //notifica mudança
    }

    public Boolean getEstadoDisparado() {
        return estadoDisparado;
    }

    public void setEstadoDisparado(Boolean estadoDisparado) {
        this.estadoDisparado = estadoDisparado;
        notifyObservers(); //notifica mudança
    }
    
}
