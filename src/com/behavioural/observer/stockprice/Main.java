package com.behavioural.observer.stockprice;

public class Main {
    public static void main(String[] args) {
        var appleStock = new Stock(100.50, "AAPL", 100);
        var priceObserver = new PriceObserver(appleStock);
        var alertObserver = new AlertObserver(appleStock, 1000);
        var volumeObserver = new VolumeObserver(appleStock);

        appleStock.attach(priceObserver);
        appleStock.attach(alertObserver);
        appleStock.attach(volumeObserver);

        appleStock.setPrice(200);
        appleStock.setVolume(10000);
        appleStock.setPrice(2000);
    }
}
