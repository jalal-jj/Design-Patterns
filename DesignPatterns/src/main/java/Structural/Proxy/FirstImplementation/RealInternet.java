package Structural.Proxy.FirstImplementation;

public class RealInternet implements Internet{
    @Override
    public void connectTo(String host) {
        System.out.println("Connecting to " +host+" with RealInternet ");
    }
}
