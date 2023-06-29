package Structural.Proxy.FirstImplementation;

public class Main {

    public static void main(String[] args) {

        Internet internet=new ProxyInternet();
        internet.connectTo("bannedsite.com");
        internet.connectTo("normalsite.com");
    }
}
