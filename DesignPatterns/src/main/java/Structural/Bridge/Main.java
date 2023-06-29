package Structural.Bridge;

public class Main {

    public static void main(String[] args) {
        VeggiePizza veggiePizza=new VeggiePizza();
        AmericanResturant americanResturant=new AmericanResturant(veggiePizza);
        americanResturant.deliver();
        System.out.println(veggiePizza);
    }



}
