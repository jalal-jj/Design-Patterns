package Creational.Factory.Delivery;

import Creational.Factory.Transport.Ship;
import Creational.Factory.Transport.Transport;

public class SeaLogistic extends Logistics {
    @Override
    public Transport sendByAnyTransportYouWant() {
        return new Ship();
    }

}
