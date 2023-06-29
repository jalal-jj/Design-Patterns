package Behavioral.Visitor;

public interface Visitor {
    void visit(NCBank bank);
    void visit(AnyBank bank);
}
