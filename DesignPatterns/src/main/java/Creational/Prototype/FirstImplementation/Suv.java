package Creational.Prototype.FirstImplementation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Suv extends Prototype{
    private String name;
    public Suv(String name) {
        this.name=name;
        type="SUV Type";

    }

    @Override
    String getType() {
        return name;
    }
}
