package Behavioral.Iterator;

import lombok.Data;

import java.util.Iterator;

@Data
public class ChildLibrary {
    private Book[] books;

    public ChildLibrary() {
        this.books = new Book[10];
        for (int i=0;i<10;i++){
            books[i]=new Book(i,"Book array from Child Library");
        }
    }

    public BookIterator getIteratorFromChildLibrary(Book[] books){
        return new BookIterator(books);
    }
}
