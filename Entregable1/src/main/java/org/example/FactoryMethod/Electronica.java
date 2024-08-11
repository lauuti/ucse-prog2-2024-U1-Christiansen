package org.example.FactoryMethod;

import org.example.FactoryMethod.Interface.Product;

public class Electronica implements Product {
    @Override
    public void existe() {System.out.println("El producto es tipo electronico.");};

}