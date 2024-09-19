package com.behavioural.strategy;

import com.behavioural.strategy.image_storage.*;
import com.behavioural.strategy.payment.*;

public class Main {
    public static void main(String[] args) {
        var imageProcessor = new ImageProcessor();
        imageProcessor.store("passport.heic", new JPEGCompressor(), new BlackAndWhiteFilter());
        imageProcessor.store("profile.svg", new PNGCompressor(), new BlackAndWhiteFilter());

        ShoppingCart cart = new ShoppingCart();

        // Add items to cart
        cart.addItem(new Item("Book", 30));
        cart.addItem(new Item("Pen", 5));

        // Set payment strategy to Credit Card and checkout
        PaymentStrategy creditCard = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25");
        cart.setPaymentStrategy(creditCard);
        cart.checkout(); // Output: 35 paid using Credit Card.

        // Set payment strategy to PayPal and checkout
        PaymentStrategy payPal = new PayPalPayment("john.doe@example.com", "password123");
        cart.setPaymentStrategy(payPal);
        cart.checkout(); // Output: 35 paid using PayPal.

        // Set payment strategy to Bitcoin and checkout
        PaymentStrategy bitcoin = new BitcoinPayment("1BoatSLRHtKNngkdXEeobR76b53LETtpyT");
        cart.setPaymentStrategy(bitcoin);
        cart.checkout(); // Output: 35 paid using Bitcoin.
    }
}
