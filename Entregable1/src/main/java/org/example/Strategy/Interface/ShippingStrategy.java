package org.example.Strategy.Interface;

public interface ShippingStrategy {
    double calculateCost(double peso, double[] dimensiones, String origen, String destino);
}
