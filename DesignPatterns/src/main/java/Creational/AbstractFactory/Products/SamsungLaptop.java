package Creational.AbstractFactory.Products;

import Creational.AbstractFactory.Products.Inter.Laptop;

public class SamsungLaptop implements Laptop {
    @Override
    public String assembleLaptop() {
        return "Samsung Laptop assembling";
    }
}
