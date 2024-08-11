package org.example.Bridge.Interface;

public interface PaymentGateway {
    void authorize(double n);
    void capture(double n);
}
