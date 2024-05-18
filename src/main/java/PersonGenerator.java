import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class PersonGenerator{

    protected static Tutor generateTutor(){
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        String thirdName = faker.name().firstName() + "вич";
        int age = faker.number().numberBetween(18, 25);
       return new Tutor(name, surname, age,  thirdName);

    }

    protected static Student generateStudent(){
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        int age = faker.number().numberBetween(18, 25);
        return new Student(name, surname, age);
    }


}
