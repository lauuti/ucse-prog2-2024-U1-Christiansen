package org.example.Main;

import org.example.FactoryMethod.Factory.ProductSelector;

public class Main {
    public static void main (String[] args) {
        ProductSelector Selector = new ProductSelector();
        Selector.selectProduct("Electronica");
        Selector.selectProduct("Ropa");
        Selector.selectProduct("Vehiculos");
    }

}
