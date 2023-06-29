package Behavioral.ChainOfResponsibility.BankCashImpl;

import lombok.Data;

@Data
public class Withdraw {

    private String customerId;
    private int amount;
    private String currencyType;

    public Withdraw(String customerId, int amount, String currencyType) {
        this.customerId = customerId;
        this.amount = amount;
        this.currencyType = currencyType;
    }
}
