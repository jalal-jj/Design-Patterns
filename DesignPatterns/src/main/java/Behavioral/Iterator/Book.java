package Behavioral.Iterator;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
