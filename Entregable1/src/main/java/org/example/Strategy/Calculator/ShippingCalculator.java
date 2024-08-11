package org.example.Strategy.Calculator;

import org.example.Strategy.Interface.ShippingStrategy;

public class ShippingCalculator {
    private double peso;
    private double[] dimensiones;
    private String origen;
    private String destino;
    private ShippingStrategy strategy;
    public ShippingCalculator(double peso, double[] dimensiones, String origen, String destino, ShippingStrategy strategy) {
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.origen = origen;
        this.destino = destino;
        this.strategy = strategy;
    }
}
