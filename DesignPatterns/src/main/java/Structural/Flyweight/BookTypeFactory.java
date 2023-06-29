package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {

    private static Map<String,BookType> bookTypeMap=new HashMap<>();

    public static BookType getBookTypeIfExists(BookType bookType){
        if (bookTypeMap.get(bookType.getName())==null){
            bookTypeMap.put(bookType.getName(), bookType);
        }
        return bookTypeMap.get(bookType);
    }
}
