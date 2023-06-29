package Behavioral.Mediator;

import java.util.List;

public interface Mediator {
    List<AbstractSeller> findSellerWithPrice(long price);
    List<AbstractBuyer> findBuyerWithPrice(long price);
    AbstractBuyer addBuyer(Buyer buyer);
    AbstractSeller addSeller(Seller seller);
}
