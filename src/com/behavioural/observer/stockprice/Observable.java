package com.behavioural.observer.stockprice;

public interface Observable {
    void attach(Observer o);

    void detach(Observer o);

    void notifyObservers();
}
