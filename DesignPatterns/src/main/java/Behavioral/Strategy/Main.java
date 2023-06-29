package Behavioral.Strategy;

public class Main {

    public static void main(String[] args) {
        Developer developer=new Developer(new Reading());
        developer.executeActivity();
        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
