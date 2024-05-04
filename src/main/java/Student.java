import Books.Book;

import java.util.ArrayList;
import java.util.List;

public class Student extends AbstractHuman {
    private List<Book> books = new ArrayList<>();

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}


