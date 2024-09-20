package com.behavioural.observer.stockprice;

public class AlertObserver implements Observer{
    private final Stock stock;
    private final double target;

    public AlertObserver(Stock stock, int target) {
        this.stock = stock;
        this.target = target;
    }

    @Override
    public void update() {
        alert();
    }

    public void alert() {
        if (stock.getPrice() >= target)
            System.out.println("target reached! Take profit!!!!!");
    }
}
