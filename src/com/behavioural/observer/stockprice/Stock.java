package com.behavioural.observer.stockprice;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observable {
    private final List<Observer> observers = new ArrayList<>();

    private double price;
    private String symbol;
    private int volume;

    public Stock(double price, String symbol, int volume) {
        this.price = price;
        this.symbol = symbol;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
        notifyObservers();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (var observer: observers)
            observer.update();
    }
}
