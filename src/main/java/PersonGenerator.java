import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class PersonGenerator{
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final ArrayList<Tutor> tutors = new ArrayList<>();
    private static final ArrayList<AbstractHuman> persons = new ArrayList<>();
    private static void generateTutors(int amount){
        for (int i = 0; i < amount; i++) {
            Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
            String name = faker.name().firstName();
            String surname = faker.name().lastName();
            String thirdName = faker.name().firstName() + "вич";
            int age = faker.number().numberBetween(18, 25);
            tutors.add((Tutor) PersonFactory.createPerson("tutor", name, surname, thirdName, age));

        }
    }

    private static void generateStudents(int amount){
        for (int i = 0; i < amount; i++) {
            Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
            String name = faker.name().firstName();
            String surname = faker.name().lastName();
            int age = faker.number().numberBetween(18, 25);
            students.add((Student) PersonFactory.createPerson("student", name, surname, age));
        }
    }
    public static ArrayList<AbstractHuman> generatePersons(int tutorsAmount, int studentsAmount){
        generateStudents(studentsAmount);
        generateTutors(tutorsAmount);
        persons.addAll(students);
        persons.addAll(tutors);
        return persons;

    }

}
