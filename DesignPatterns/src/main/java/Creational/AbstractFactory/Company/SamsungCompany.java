package Creational.AbstractFactory.Company;

import Creational.AbstractFactory.Company.Abstract.Company;
import Creational.AbstractFactory.Products.Inter.Laptop;
import Creational.AbstractFactory.Products.SamsungLaptop;
import Creational.AbstractFactory.Products.SamsungTV;
import Creational.AbstractFactory.Products.Inter.TV;

public class SamsungCompany extends Company {
    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }

    @Override
    public TV createTv() {
        return new SamsungTV();
    }
}
