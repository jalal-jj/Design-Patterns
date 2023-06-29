package Structural.Decorator;

public class WhatsappDecorator extends BaseNotifierDecorator{

    public WhatsappDecorator(NotifierInterface wrapped) {
        super(wrapped);
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }



}
