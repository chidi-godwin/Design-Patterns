package com.behavioural.observer.stockprice;

public class VolumeObserver implements Observer {
    private final Stock stock;

    public VolumeObserver(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("New volume: " + stock.getSymbol() + " --> " + stock.getVolume());
    }
}
