package Structural.Decorator;

public class FbNotifierDecorator extends BaseNotifierDecorator {
    private String user;

    FbNotifierDecorator(NotifierInterface wrapped,String user) {
        super(wrapped);
        this.user=user;
    }

    @Override
    public String getUserName() {
        return super.getUserName()+user;
    }
}
