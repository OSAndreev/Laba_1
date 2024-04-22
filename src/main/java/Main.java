import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<AbstractHuman> users = new ArrayList<>();
        // Наполнение пользователей книгами

        Student student = new Student("Ivan", "Ivanov", 20);
        student.addBook(new RussianTextbook("Физика", "Иванов И.И.", 2020));
        users.add(student);
        Tutor tutor = new Tutor("Marat", "Agafonov" ,20, "Ildarovich");
        tutor.addBook(new EnglishTextbook("Физика", "Иванов И.И.", 2020, "Intermediate"));
        users.add(tutor);
        // Добавить больше пользователей и книг

        new LibraryGUI(users);
    }
}
