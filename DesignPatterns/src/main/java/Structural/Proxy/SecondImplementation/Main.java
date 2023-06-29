package Structural.Proxy.SecondImplementation;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        DirectorProxy proxy=new DirectorProxy("Jalal","Jalal");
        System.out.println(proxy.getSomeSecretInfo());

    }
}
