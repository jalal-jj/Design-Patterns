package Structural.Bridge;

public class ItalianRestaurant extends Restaurant{

    protected ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Adding Italian Sauce");
    }


}
