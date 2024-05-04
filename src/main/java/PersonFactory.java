import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class PersonFactory {
    public static AbstractHuman createPerson(String role, String name, String surname, int age){
        if (role.equalsIgnoreCase("student")){
            return new Student(name, surname, age);
        }
        else{
            return null;
        }
    }
    public static AbstractHuman createPerson(String role, String name, String surname, String thirdName, int age){
        if (role.equalsIgnoreCase("tutor")){
            return new Tutor(surname, name, age, thirdName);        }
        else{
            return null;
        }
    }
}
