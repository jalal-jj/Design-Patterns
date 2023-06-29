package Creational.Builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;
    private byte numberOfDoors;
    private int weight;
    private int height;


    public CarBuilder (int id,String brand,String model){
        this.id=id;
        this.brand=brand;
        this.model=model;
    }
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder numberOfDoors (byte numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public CarBuilder height (int height) {
        this.height = height;
        return this;
    }
    public Car build(){
        Car car=new Car(this);
        return car;
    }

}
