package com.observerpp;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento implements ObserverSensor, SubjectSistema{
    private List<ObserverSistema> observers = new ArrayList<>();
    private List<Sensor> sensores = new ArrayList<>();

    private String nomeSistema;
    private Boolean sistemaDisparado = false;

    private String nomeSensor;
    private Boolean estadoSensorDisparado;


    //Observer
    public void registerObserver(ObserverSistema o){
        this.observers.add(o);
    }
    public void removeObserver(ObserverSistema o){
        this.observers.remove(o);
    }
    public void notifyObservers(){
        for(ObserverSistema o: observers){
            o.update(nomeSistema, nomeSensor, sistemaDisparado, estadoSensorDisparado);
        }
    }
    
    //subject
    public void update(String nome, Boolean estado){
        this.nomeSensor = nome;
        this.estadoSensorDisparado = estado;
        for(Sensor s : sensores){
            if(s.getEstadoDisparado()){
                this.sistemaDisparado = true;  
                this.display();
                this.notifyObservers();              
                return;
            }else{
                this.sistemaDisparado = false;
            }
        }
        this.display();
        this.notifyObservers();
    }
    public String display(){
        
        String estado = this.estadoSensorDisparado?"disparado.":"silenciado.";
        
        return "Sistema de Monitoramento: O sensor "+nomeSensor+" foi "+estado;
    }

    //gets e sets
    public List<Sensor> getSensores() {
        return sensores;
    }
    
    public void addSensor (Sensor sensor){
        this.sensores.add(sensor);
        sensor.registerObserver(this);//registra a instância no subject
    }
    public void removeSensor (Sensor sensor){
        this.sensores.remove(sensor);
    }

    public String getNomeSistema() {
        return nomeSistema;
    }
    
    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }
    
    public Boolean getSistemaDisparado() {
        return sistemaDisparado;
    }
    
    public void setSistemaDisparado(Boolean sistemaDisparado) {
        this.sistemaDisparado = sistemaDisparado;
    }
    
    public String getNomeSensor() {
        return nomeSensor;
    }
    
    public void setNomeSensor(String nomeSensor) {
        this.nomeSensor = nomeSensor;
    }
    
    public Boolean getEstadoSensorDisparado() {
        return estadoSensorDisparado;
    }
    
    public void setEstadoSensorDisparado(Boolean estadoSensorDisparado) {
        this.estadoSensorDisparado = estadoSensorDisparado;
    }
}
