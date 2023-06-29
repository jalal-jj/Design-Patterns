package Structural.Composite;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class MultiBox implements Calculatable {
    private String name;
    private List<Product> products;
    private List<Box> boxList;

    public MultiBox(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.boxList = new ArrayList<>();
    }

    @Override
    public int getPrice() {
        int total = 0;
        int box = CalculateUtil.calculateBaskets(boxList);
        int product = CalculateUtil.calculateProducts(products);
        return total = box + product;
    }
}
