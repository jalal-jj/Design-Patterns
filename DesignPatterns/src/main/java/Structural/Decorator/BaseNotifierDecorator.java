package Structural.Decorator;

public abstract class BaseNotifierDecorator implements NotifierInterface{
    private NotifierInterface wrapped;

     BaseNotifierDecorator(NotifierInterface wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getUserName() {
        return wrapped.getUserName();
    }
}
