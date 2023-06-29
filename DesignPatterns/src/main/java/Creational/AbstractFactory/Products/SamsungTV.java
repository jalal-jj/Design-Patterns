package Creational.AbstractFactory.Products;

import Creational.AbstractFactory.Products.Inter.TV;

public class SamsungTV implements TV {
    @Override
    public String assembleTV() {
        return "Samsung Tv assembling";
    }
}
