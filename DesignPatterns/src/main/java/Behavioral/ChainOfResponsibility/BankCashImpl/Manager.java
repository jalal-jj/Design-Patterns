package Behavioral.ChainOfResponsibility.BankCashImpl;

public class Manager extends Employee {
    public Manager() {
    }

    @Override
    public void setNext(Employee next) {
        super.setNext(next);
    }

    @Override
    public void processRequest(Withdraw withdraw) {
        if (withdraw.getAmount() < 5000) {
            System.out.println("Manager can give you money");
        } else if (next != null) {
            System.out.println("Manager cannot give you money");
            next.processRequest(withdraw);
        }
       else throw new RuntimeException("Exception handled" + getClass().getName());
    }
}
