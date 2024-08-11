package org.example.Bridge;

import org.example.Bridge.Interface.PaymentGateway;

public class MercadoPagoPaymentProcessor extends PaymentProcessor{
    public MercadoPagoPaymentProcessor(PaymentGateway pay) {
        super();
    }

    @Override
    public void processPayment(double n) {
        pay.authorize(n);
        pay.capture(n);
        System.out.println("A través de Mercado Pago se ha procesado el pago.");
    }

    @Override
    public void refundPayment(double n) {
        System.out.println("A través de Mercado Pago se ha reembolsado el pago.");
    }
}
