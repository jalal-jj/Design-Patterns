package Structural.Adapter;

public class MyTelephone implements Telephone{

    private int volt;

    public MyTelephone() {
        this.volt = 5;
    }
    @Override
    public int chargeIt() {
        return volt;
    }
}
