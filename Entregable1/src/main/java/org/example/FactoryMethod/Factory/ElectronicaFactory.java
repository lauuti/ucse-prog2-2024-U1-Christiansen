package org.example.FactoryMethod.Factory;

import org.example.FactoryMethod.Electronica;
import org.example.FactoryMethod.Interface.Product;

public class ElectronicaFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new Electronica();
    }
}
