package Behavioral.Mediator;

public enum PropertyEnum {
    Apartment("Apartment"),
    House("House"),
    Villa("Villa"),
    Mansion("Mansion");
    private String name;

    PropertyEnum(String name) {
        this.name = name;
    }
}
