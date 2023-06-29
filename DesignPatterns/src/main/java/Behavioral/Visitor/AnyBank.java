package Behavioral.Visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AnyBank extends Bank {

    public AnyBank(String name, String address, BankTypeEnum bankTypeEnum,double percent,double discount) {
        super(name, address, bankTypeEnum, discount, percent);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
