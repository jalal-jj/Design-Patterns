package Structural.Composite;

import java.util.List;

public class CalculateUtil {

    public static int calculateProducts(List<Product> products) {
        int total = 0;
        for (Product product : products) {
            total+=product.getPrice();
            System.out.println(product);
        }
        return total;
    }

    public static int calculateBaskets(List<Box> boxList) {
        int total = 0;
        for (Box box : boxList) {
            total+=box.getPrice();
            System.out.println(box);
        }
        return total;
    }
}
