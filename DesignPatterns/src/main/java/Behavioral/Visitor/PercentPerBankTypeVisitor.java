package Behavioral.Visitor;

public class PercentPerBankTypeVisitor implements Visitor{

    @Override
    public void visit(AnyBank bank) {
            if (bank.discount>1){
                bank.percent= bank.discount+3;
            }
    }

    @Override
    public void visit(NCBank bank) {

    }
}
