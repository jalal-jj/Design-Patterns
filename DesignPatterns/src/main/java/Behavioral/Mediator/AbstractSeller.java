package Behavioral.Mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public abstract class AbstractSeller {

    private String name;
    private PropertyEnum property;
    private long price;
    private Mediator mediator;

    public AbstractSeller(String name, PropertyEnum property, long price, Mediator mediator) {
        this.name = name;
        this.property = property;
        this.price = price;
        this.mediator = mediator;
    }
    public List<AbstractBuyer> sell(long price){
       return mediator.findBuyerWithPrice(price);
    }
}
