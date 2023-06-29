package Creational.Factory.Transport;

public class Car implements Transport {
    @Override
    public String send() {
        return "Sended by Car";
    }
}
