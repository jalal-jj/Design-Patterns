package Creational.Factory.Transport;

public class Ship implements Transport {
    @Override
    public String send() {
        return "Sended by Ship";
    }
}
