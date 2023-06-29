package Structural.Composite;


import lombok.ToString;
import java.util.List;

@ToString
public class Box implements Calculatable{
    private String boxName;
    private List<Product> products;

    public Box(String boxName,List<Product>products) {
        this.boxName=boxName;
        this.products = products;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public int getPrice() {
        return CalculateUtil.calculateProducts(products);
    }
}
