package Structural.Composite;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Product product = new Product("pr1", 10);
        Product product1 = new Product("pr3", 10);

        Box box=new Box("box",List.of(new Product("prbox",10),new Product("pr2box",10)));
        MultiBox multiBox=new MultiBox("multi");

        multiBox.setBoxList(List.of(new Box("",List.of(new Product("",10)))));
        multiBox.setProducts(List.of(new Product("",11)));

        CustomerBasket customerBasket=new CustomerBasket(1);
        customerBasket.setCalculatableList(List.of(product1,product,box,multiBox));
        Integer d=customerBasket.totalPrice();
        System.out.println(d);

    }

}
