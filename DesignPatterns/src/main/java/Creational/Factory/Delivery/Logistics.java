package Creational.Factory.Delivery;

import Creational.Factory.Transport.Transport;

public abstract class Logistics {
    public Transport createTransport() {
        Transport transport = sendByAnyTransportYouWant();
        transport.send();
        return transport;
    }

    public abstract Transport sendByAnyTransportYouWant();
}
