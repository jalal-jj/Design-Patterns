package Creational.AbstractFactory.Products;

import Creational.AbstractFactory.Products.Inter.TV;

public class SonyTv implements TV {
    @Override
    public String assembleTV() {
        return " Sony TV assembling ";
    }
}
