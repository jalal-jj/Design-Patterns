package Structural.Flyweight;

import lombok.Getter;

@Getter
public enum BookType {

    Detectiv("Detectiv"),
    Roman("Roman"),
    History("History");
    private String name;

    BookType(String name) {
        System.out.println("Created");
        this.name = name;
    }




}
