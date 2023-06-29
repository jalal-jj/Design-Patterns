package Behavioral.ChainOfResponsibility.BankCashImpl;

public class Director extends Employee {
    public Director() {
    }

    @Override
    public void setNext(Employee next) {
        super.setNext(next);
    }

    @Override
    public void processRequest(Withdraw withdraw) {
        if (withdraw.getAmount() >= 5000) {
            System.out.println("Director can give you money");
        } else if (next == null) {
            System.out.println("Director cannot give you money");
            next.processRequest(withdraw);
        }
        else throw new RuntimeException("Exception :" + getClass().getName());

    }
}
