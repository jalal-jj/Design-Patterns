package Behavioral.ChainOfResponsibility.BankCashImpl;

public abstract class Employee {
    protected Employee next;

    public void setNext(Employee next) {
        this.next = next;
    }

    public abstract void processRequest(Withdraw withdraw);
}
