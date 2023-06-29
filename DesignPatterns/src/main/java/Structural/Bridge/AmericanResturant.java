package Structural.Bridge;

public class AmericanResturant extends Restaurant{
    protected AmericanResturant(Pizza pizza) {
        super(pizza);
    }
    @Override
    void addSauce() {
        pizza.setSauce( "Adding American sauce ");
    }
}
