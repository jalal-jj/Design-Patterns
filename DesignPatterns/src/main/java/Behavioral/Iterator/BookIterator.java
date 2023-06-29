package Behavioral.Iterator;

import lombok.Getter;
import lombok.Setter;
import java.util.Iterator;

@Getter
@Setter
public class BookIterator implements Iterator {
    private Book[] books;
    private int row;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        if (row < books.length) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = books[row];
        row++;
        return book;
    }
}
