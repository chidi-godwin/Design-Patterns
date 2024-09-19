package com.behavioural.strategy.payment;

public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cardHolder;
    private final String cvv;
    private final String expriyDate;

    public CreditCardPayment(String cardNumber, String cardHolder, String cvv, String expriyDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.cvv = cvv;
        this.expriyDate = expriyDate;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Credit Card");
    }
}
