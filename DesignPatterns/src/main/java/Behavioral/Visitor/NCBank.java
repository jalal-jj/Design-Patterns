package Behavioral.Visitor;

public class NCBank extends Bank{



    public NCBank(String name, String address, BankTypeEnum bankTypeEnum,double percent,double discount) {
        super(name, address, bankTypeEnum, discount, percent);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
