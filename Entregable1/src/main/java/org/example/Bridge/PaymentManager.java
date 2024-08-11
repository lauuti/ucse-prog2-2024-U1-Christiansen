package org.example.Bridge;

import org.example.Bridge.Interface.PaymentGateway;

public class PaymentManager {
    public void processPayment(double amount, String provider) {
        PaymentProcessor pro = null;
        PaymentGateway paygw;

        if (provider.toUpperCase() == "PAYPAL") {
            paygw = new PaypalPaymentGateway();
            pro = new PaypalPaymentProcessor(paygw);
        }
        if (provider.toUpperCase() == "MERCADOPAGO") {
            paygw = new MercadoPagoPaymentGateway();
            pro = new MercadoPagoPaymentProcessor(paygw);
        } else {
            System.out.println("Provider de pago no aceptado");
        }

        pro.processPayment(amount);
    }
}
