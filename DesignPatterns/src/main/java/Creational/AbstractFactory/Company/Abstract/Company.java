package Creational.AbstractFactory.Company.Abstract;

import Creational.AbstractFactory.Products.Inter.Laptop;
import Creational.AbstractFactory.Products.Inter.TV;

public abstract class Company {
    public abstract Laptop createLaptop();
    public abstract TV createTv();


}
