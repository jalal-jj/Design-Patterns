package Structural.Composite;

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@ToString
public class CustomerBasket {
    private int id;
    private List<Calculatable> calculatableList;

    public CustomerBasket(int id) {
        this.id = id;
        this.calculatableList=new ArrayList<>();
    }
    public Integer totalPrice(){
        int total=0;
        for (Calculatable calculatable:calculatableList){
//            System.out.println(calculatable.getPrice()+ " customer");
            total+=calculatable.getPrice();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Calculatable> getCalculatableList() {
        return calculatableList;
    }

    public void setCalculatableList(List<Calculatable> calculatableList) {
        this.calculatableList = calculatableList;
    }
}
