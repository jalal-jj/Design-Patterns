package Creational.Builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

    private int id;
    private String brand;
    private String model;
    private String color;
    private byte numberOfDoors;
    private int weight;
    private int height;

    Car(CarBuilder builder) {
        this.id = builder.getId();
        this.brand = builder.getBrand();
        this.model = builder.getModel();
        this.color = builder.getColor();
        this.numberOfDoors = builder.getNumberOfDoors();
        this.weight = builder.getWeight();
        this.height = builder.getHeight();

    }

    public static void main(String[] args) {
        Car car = new CarBuilder(1, "Subaru", "Impreza WRX STI")
                .color("blue")
                .numberOfDoors((byte) 5)
                .weight(1480)
                .build();
        System.out.println(car);
    }
}
