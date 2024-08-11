package org.example.Strategy;

import org.example.Strategy.Interface.ShippingStrategy;

public class BoatShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double peso, double[] dimensiones, String origen, String destino) {
        double precio = peso * 0.075;
        return precio;

    }
}
