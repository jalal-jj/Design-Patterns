package Creational.Prototype.FirstImplementation;

import lombok.ToString;

@ToString
public class Coupe extends Prototype{
    public Coupe() {
        type="Coupe Car";
    }

    @Override
    String getType() {
        return "Coupe Type";
    }
}
