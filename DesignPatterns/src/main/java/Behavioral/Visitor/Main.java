package Behavioral.Visitor;

public class Main {

    public static void main(String[] args) {
        AnyBank bank=new AnyBank("any","add",BankTypeEnum.OnlineBank,8.75,1.2);
        PercentPerBankTypeVisitor visitor=new PercentPerBankTypeVisitor();
        System.out.println(bank.percent);
        bank.accept(visitor);
        visitor.visit(bank);
        System.out.println(bank.percent);
    }


}
