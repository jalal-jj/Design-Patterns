package Behavioral.Iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        AdultLibrary adultLibrary = new AdultLibrary();
        ChildLibrary childLibrary = new ChildLibrary();
        Iterator<Book> adults = adultLibrary.getIteratorFromAdultLibrary(adultLibrary.getBooks());
        Iterator<Book> childs=childLibrary.getIteratorFromChildLibrary(childLibrary.getBooks());
        System.out.println(adultLibrary);
        System.out.println(childLibrary);


    }
}
