package Structural.Decorator;

public class App {

    public static void main(String[] args) {
       NotifierInterface notifierInterface= new FbNotifierDecorator(new WhatsappDecorator(new Notifier("Jalal")),"JJ");
        System.out.println(notifierInterface.getUserName());
    }

}
