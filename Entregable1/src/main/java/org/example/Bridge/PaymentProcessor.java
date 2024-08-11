package org.example.Bridge;
import org.example.Bridge.Interface.PaymentGateway;
public abstract class PaymentProcessor {
    public PaymentGateway pay;
    public abstract void processPayment(double n);
    public abstract void refundPayment(double n);
}
