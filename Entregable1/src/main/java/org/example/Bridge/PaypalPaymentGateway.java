package org.example.Bridge;
import org.example.Bridge.Interface.PaymentGateway;
public class PaypalPaymentGateway implements PaymentGateway {
    public void authorize(double n) {
        System.out.println("Paypal esta autorizando el pago: " + n);
    }
    public void capture(double n) {
        System.out.println("Paypal esta obteniendo el pago: " + n);
    }
}
