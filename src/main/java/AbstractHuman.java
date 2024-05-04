import Books.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHuman {
    private String firstName;
    private String lastName;
    private int age;
    private List<Book> books; // Список книг пользователя

    public AbstractHuman(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = new ArrayList<>(); // Инициализация пустого списка
    }

    // Методы для доступа и модификации имени и фамилии
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getInfo(){
        return this.getFirstName() + " " + this.getLastName();
    }
}
