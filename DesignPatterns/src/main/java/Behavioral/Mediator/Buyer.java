package Behavioral.Mediator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Buyer extends AbstractBuyer{

    public Buyer(String name, PropertyEnum property, long price, Mediator mediator) {
        super(name, property, price, mediator);
    }
}
