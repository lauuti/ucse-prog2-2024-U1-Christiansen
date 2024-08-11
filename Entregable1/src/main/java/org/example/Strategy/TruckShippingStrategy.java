package org.example.Strategy;
import org.example.Strategy.Interface.ShippingStrategy;
public class TruckShippingStrategy implements ShippingStrategy{
    @Override
    public double calculateCost(double peso, double[] dimensiones, String origen, String destino) {
        double precio = peso * 0.05;
        return precio;
    }
}
