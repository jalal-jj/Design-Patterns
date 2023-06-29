package Creational.AbstractFactory.Products;

import Creational.AbstractFactory.Products.Inter.Laptop;

public class SonyLaptop implements Laptop {
    @Override
    public String assembleLaptop() {
        return "Sony Laptop is assembling";
    }
}
