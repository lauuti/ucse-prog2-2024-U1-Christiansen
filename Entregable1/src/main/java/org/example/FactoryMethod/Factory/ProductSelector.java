package org.example.FactoryMethod.Factory;

import org.example.FactoryMethod.Interface.Product;

import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class ProductSelector {
    ElectronicaFactory Electronica = new ElectronicaFactory();
    VehiculosFactory Vehiculos = new VehiculosFactory();
    RopaFactory Ropa = new RopaFactory();

    ArrayList<Product> productos = new ArrayList<Product>();
    public Product selectProduct(String producto){
        if (producto == "Electronica") {
            System.out.println("1 entidad de clase Electronica se ha creado exitosamente");
            return Electronica.createProduct();
        }
        if (producto == "Ropa") {
            System.out.println("1 entidad de clase Ropa se ha creado exitosamente");
            return Vehiculos.createProduct();
        }
        if (producto == "Vehiculos"){
            System.out.println("1 entidad de clase Vehiculos se ha creado exitosamente");
            return Ropa.createProduct();
        }
         System.out.println("No se ha podido crear ninguna entidad. Error en el ingreso de datos");
         return null;
    }
}
