package Behavioral.ChainOfResponsibility.BankCashImpl;

public class Main {

    public static void main(String[] args) {
        Withdraw withdraw=new Withdraw("number",5000,"Azn");
        Cahier cahier=new Cahier();
        Manager manager=new Manager();
        Director director=new Director();
        cahier.setNext(manager);
        manager.setNext(director);
        cahier.processRequest(withdraw);


    }
}
