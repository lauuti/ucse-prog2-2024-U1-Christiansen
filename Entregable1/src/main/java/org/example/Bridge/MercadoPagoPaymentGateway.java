package org.example.Bridge;
import org.example.Bridge.Interface.PaymentGateway;
public class MercadoPagoPaymentGateway implements PaymentGateway {
    @Override
    public void authorize(double n) {System.out.println("MercadoPago esta autorizando el pago de: " + n);}
    @Override
    public void capture(double n) {System.out.println("MercadoPago esta capturando el pago de: " + n);}
}
