package Behavioral.Mediator;

public class Seller extends AbstractSeller{

    public Seller(String name, PropertyEnum property, long price, Mediator mediator) {
        super(name, property, price, mediator);
    }
}
