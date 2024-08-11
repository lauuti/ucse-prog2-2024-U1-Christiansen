package org.example.FactoryMethod.Factory;

import org.example.FactoryMethod.Interface.Product;
import org.example.FactoryMethod.Vehiculos;

public class VehiculosFactory extends ProductFactory {
    @Override
    public Product createProduct() {
        return new Vehiculos();
    }
}
