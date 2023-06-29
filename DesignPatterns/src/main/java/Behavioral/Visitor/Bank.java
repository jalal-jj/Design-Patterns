package Behavioral.Visitor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Bank {
    private final String name;
    private final String address;
    private final BankTypeEnum bankTypeEnum;
    protected double discount;
    protected double percent;

    public Bank(String name, String address, BankTypeEnum bankTypeEnum, double discount, double percent) {
        this.name = name;
        this.address = address;
        this.bankTypeEnum = bankTypeEnum;
        this.discount = discount;
        this.percent = percent;
    }

    public abstract void accept(Visitor visitor);
}
