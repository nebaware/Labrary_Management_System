package model;

import java.util.List;

public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void addBook(List<Book> library, Book book) {
        library.add(book);
    }

    public void removeBook(List<Book> library, Book book) {
        library.remove(book);
    }

    public String getName() {
        return name;
    }
}
