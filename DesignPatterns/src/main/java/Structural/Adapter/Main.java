package Structural.Adapter;

public class Main {

    public static void main(String[] args) {
        PlugSocket socket=new PlugSocket();

        AirConditioner conditioner=new AirConditioner();
        MyTelephone myTelephone=new MyTelephone();
        TelephoneAdapter adapter=new TelephoneAdapter(myTelephone);

        System.out.println(socket.giveElectricity(conditioner));
        System.out.println(socket.giveElectricity(adapter));

    }
}
