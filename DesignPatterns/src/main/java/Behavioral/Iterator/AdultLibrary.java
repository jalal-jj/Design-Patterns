package Behavioral.Iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class AdultLibrary {
    private List<Book> books;

    public AdultLibrary() {
        this.books = new ArrayList<>();
        for (int i=0;i<10;i++){
            books.add(new Book(i,"List from Adult Library"));
        }
    }

    public Iterator<Book> getIteratorFromAdultLibrary(List<Book> books){
        return books.iterator();
    }
}
