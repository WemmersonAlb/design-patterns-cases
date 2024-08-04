package com.observerpp;

public interface SubjectSistema {
    public void registerObserver(ObserverSistema o);
    public void removeObserver(ObserverSistema o);
    public void notifyObservers();
}
