package Behavioral.Mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public abstract class AbstractBuyer {
    private String name;
    private PropertyEnum property;
    private long price;
    private Mediator mediator;

    public AbstractBuyer(String name, PropertyEnum property, long price, Mediator mediator) {
        this.name = name;
        this.property = property;
        this.price = price;
        this.mediator = mediator;
    }

    public List<AbstractSeller> buy(long price) {
        return mediator.findSellerWithPrice(price);
    }
}
