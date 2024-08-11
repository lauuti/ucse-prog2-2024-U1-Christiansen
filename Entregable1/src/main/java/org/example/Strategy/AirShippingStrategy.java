package org.example.Strategy;
import org.example.Strategy.Interface.ShippingStrategy;
public class AirShippingStrategy implements ShippingStrategy {
    @Override
    public double calculateCost(double peso, double[] dimensiones, String origen, String destino) {
        double volumen = dimensiones[0] * dimensiones[1] * dimensiones[2];
        double precio = peso * volumen * 0.1;
        return precio;
    }
}
