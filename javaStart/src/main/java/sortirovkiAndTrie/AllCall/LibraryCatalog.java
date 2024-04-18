package sortirovkiAndTrie.AllCall;

import java.util.HashMap;
import java.util.Map;

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

public class LibraryCatalog {
    private HashMap<String, Book> catalog;

    public LibraryCatalog(HashMap<String, Book> catalog) {
        this.catalog = catalog;
    }

    public LibraryCatalog() {
        catalog = new HashMap<>();
    }

    public void addBook(String title, String author, int year) {
        Book newBook = new Book(title, author, year);
        catalog.put(title, newBook);
    }

    public void removeBook(String title) {
        catalog.remove(title);
    }

    public Book findBook(String title) {
        return catalog.get(title);
    }

    public static void main(String[] args) {
        HashMap<String, Book>  catalog  =  new HashMap<>(); //  так переделал я
        LibraryCatalog library = new LibraryCatalog(catalog); //  так переделал я
        //LibraryCatalog library = new LibraryCatalog(); // так предложил чатгпт

        library.addBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.addBook("To Kill a Mockingbird", "Harper Lee", 1960);

        System.out.println(library.findBook("The Great Gatsby").author); // Output: F. Scott Fitzgerald

        library.removeBook("To Kill a Mockingbird");

        System.out.println(library.findBook("To Kill a Mockingbird")); // Output: null
    }
}