package com.observerpp;

public class Seguradora implements ObserverSistema{
    private SistemaMonitoramento sistema;
    private String nomeSistema;
    private String nomeSensor;
    private Boolean estadoSistema;
    private Boolean estadoSensor;

    public Seguradora(SistemaMonitoramento sistema){
        this.sistema = sistema;
        sistema.registerObserver(this);
    }

    public void update(String nomeSistema, 
                        String nomeSensor, 
                        Boolean estadoSistema,
                        Boolean estadoSensor) {
        this.nomeSistema = nomeSistema;
        this.nomeSensor = nomeSensor;
        this.estadoSistema = estadoSistema;
        this.estadoSensor = estadoSensor;
        this.display();
    }
    public String display(){
        
        String estadoSensorS = this.estadoSensor?"disparado.":"silenciado.";
        String estadoSistemaS = this.estadoSistema?"disparado.":"silenciado.";
        
        return "Seguradora: O sensor "+this.nomeSensor+" foi "+estadoSensorS+". O sistema "+this.nomeSistema+" também foi "+estadoSistemaS;
    }
}
