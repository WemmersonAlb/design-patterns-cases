package com.observerpp;

public interface SubjectSensor {
    public void registerObserver(ObserverSensor o);
    public void removeObserver(ObserverSensor o);
    public void notifyObservers();
}
