package Creational.Factory;

import Creational.Factory.Delivery.Logistics;
import Creational.Factory.Delivery.RoadLogistic;
import Creational.Factory.Transport.Transport;

public class LogisticApp {

    public static void main(String[] args) {
        Logistics logistics = new RoadLogistic();
        Transport transport = logistics.createTransport();
        transport.send();
    }
}
