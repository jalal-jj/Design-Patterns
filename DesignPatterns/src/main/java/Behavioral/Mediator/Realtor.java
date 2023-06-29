package Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Realtor implements Mediator {
    private String name;
    private List<AbstractBuyer> buyers;
    private List<AbstractSeller> sellers;

    public Realtor(String name) {
        this.name=name;
        this.buyers = new ArrayList<>();
        this.sellers = new ArrayList<>();
    }

    @Override
    public List<AbstractSeller> findSellerWithPrice(long price) {
        return sellers.stream()
                 .filter(s->s.getPrice()<price)
                 .map(seller->new Seller(seller.getName(),seller.getProperty(),seller.getPrice(),seller.getMediator()))
                .collect(Collectors.toList());
    }

    @Override
    public List<AbstractBuyer> findBuyerWithPrice(long price) {
        return buyers.stream()
                .filter(b->b.getPrice()<=price)
                .map(buyer->new Buyer(buyer.getName(),buyer.getProperty(),buyer.getPrice(),buyer.getMediator()))
                .collect(Collectors.toList());
    }

    @Override
    public AbstractBuyer addBuyer(Buyer buyer) {
        if (buyers.add(buyer)){
            return buyer;
        }
        return null;
    }

    @Override
    public AbstractSeller addSeller(Seller seller) {
        if (sellers.add(seller)){
            return seller;
        }
        return null;
    }

}
