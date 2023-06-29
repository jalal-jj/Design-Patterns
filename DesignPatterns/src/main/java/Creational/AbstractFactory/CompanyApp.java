package Creational.AbstractFactory;

import Creational.AbstractFactory.Company.Abstract.Company;
import Creational.AbstractFactory.Company.SamsungCompany;
import Creational.AbstractFactory.Company.SonyCompany;

public class CompanyApp {

    public static void main(String[] args) {
        Company samsungCompany = new SamsungCompany();
        System.out.println(samsungCompany.createLaptop().assembleLaptop());

        Company sonyCompany = new SonyCompany();
        System.out.println(sonyCompany.createLaptop().assembleLaptop());

    }
}
