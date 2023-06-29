package Behavioral.ChainOfResponsibility.BankCashImpl;

public class Cahier extends Employee {
    public Cahier() {
    }

    @Override
    public void setNext(Employee next) {
        super.setNext(next);
    }

    @Override
    public void processRequest(Withdraw withdraw) {
        if (withdraw.getAmount() <= 2000) {
            System.out.println("Cashier can give you money");
        } else if (next != null) {
            System.out.println("Cashier cannot give you money");
            next.processRequest(withdraw);
        } else throw new RuntimeException("Exception in " + getClass().getName());
    }
}
