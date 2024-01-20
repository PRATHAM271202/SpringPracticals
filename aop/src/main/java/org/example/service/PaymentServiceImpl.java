package org.example.service;

public class PaymentServiceImpl implements  PaymentService{

    @Override
    public void makePayment(int value) {
        System.out.println("Payment Debited "+value);
//
//
//
        System.out.println("Payment Credited "+value);
    }
}
