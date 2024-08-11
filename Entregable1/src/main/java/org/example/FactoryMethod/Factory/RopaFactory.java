package org.example.FactoryMethod.Factory;

import org.example.FactoryMethod.Interface.Product;
import org.example.FactoryMethod.Ropa;

public class RopaFactory extends ProductFactory{
    @Override
    public Product createProduct() {
        return new Ropa();
    }
}
