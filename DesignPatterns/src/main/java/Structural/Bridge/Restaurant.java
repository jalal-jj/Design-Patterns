package Structural.Bridge;

public abstract class Restaurant {
    protected Pizza pizza;
    protected Restaurant(Pizza pizza){
        this.pizza=pizza;
    }
    abstract void addSauce();

    public  void deliver(){
        addSauce();
        pizza.assemble();
        System.out.println("Preparing Pizza");
    }
}
