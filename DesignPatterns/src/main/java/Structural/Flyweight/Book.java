package Structural.Flyweight;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Book {
    private BookType bookType;
    private String author;
    private static List<Book> bookList=new ArrayList<>();

    public Book(BookType bookType, String author) {
        this.bookType = bookType;
        this.author = author;
    }

    public static void storeBooks(Book book){
        for (int i=0;i<1000000;i++){
            BookType bookType=BookTypeFactory.getBookTypeIfExists(book.getBookType());
            bookList.add(new Book(bookType,book.getAuthor()+" : "+i));
        }
        for (int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(i));
        }
    }

    public static void main(String[] args) {
        Book.storeBooks(new Book(BookType.History," author "));
    }

}
