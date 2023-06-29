package Creational.AbstractFactory.Company;

import Creational.AbstractFactory.Company.Abstract.Company;
import Creational.AbstractFactory.Products.*;
import Creational.AbstractFactory.Products.Inter.Laptop;
import Creational.AbstractFactory.Products.Inter.TV;

public class SonyCompany extends Company {
    @Override
    public Laptop createLaptop() {
        return new SonyLaptop();
    }

    @Override
    public TV createTv() {
        return new SonyTv();
    }
}
