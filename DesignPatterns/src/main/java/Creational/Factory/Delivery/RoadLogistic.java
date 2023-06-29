package Creational.Factory.Delivery;

import Creational.Factory.Transport.Car;
import Creational.Factory.Transport.Transport;

public class RoadLogistic extends Logistics {
    @Override
    public Transport sendByAnyTransportYouWant() {
        return new Car();
    }

}