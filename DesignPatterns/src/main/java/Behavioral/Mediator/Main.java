package Behavioral.Mediator;

public class Main {

    public static void main(String[] args) {

        Realtor realtor=new Realtor("Jalal");

        realtor.addBuyer(new Buyer("Buyer1",PropertyEnum.House,100000,realtor));
        realtor.addBuyer(new Buyer("Buyer2",PropertyEnum.House,150000,realtor));

        realtor.addSeller(new Seller("Seller1",PropertyEnum.Mansion,120000,realtor));
        realtor.addSeller(new Seller("Seller1",PropertyEnum.Mansion,170000,realtor));

        System.out.println(realtor.findBuyerWithPrice(140000));

    }
}
