package org.example.FactoryMethod;

import org.example.FactoryMethod.Interface.Product;

public class Vehiculos implements Product {
    @Override
    public void existe() {
        System.out.println("Vehiculo creado");
    }
}
