package Structural.Decorator;

public class Notifier implements NotifierInterface{
    private final String username;

    public Notifier(String username) {
        this.username = username;
    }

    @Override
    public String getUserName() {
        return username;
    }
}
