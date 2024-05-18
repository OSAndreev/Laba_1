import Books.Book;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends AbstractHuman {
    private List<Book> books = new ArrayList<>();
    private String thirdName; // Отчество

    public Tutor(String firstName, String lastName, int age, String thirdName) {
        super(firstName, lastName, age);
        this.thirdName = thirdName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getThirdName() {
        return thirdName;
    }

    @Override
    public String getRole() {
        return "tutor";
    }

    @Override
    public String getInfo(){
        return this.getFirstName() + " " + this.getLastName() + " " + this.getThirdName();
    }
}

