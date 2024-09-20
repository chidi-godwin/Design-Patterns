package com.behavioural.observer.stockprice;

public class PriceObserver implements Observer {
    private final Stock stock;

    public PriceObserver(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void update() {
        System.out.println("New price: " + stock.getSymbol() + " --> $" + stock.getPrice());
    }
}
