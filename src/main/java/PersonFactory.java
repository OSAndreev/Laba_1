import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class PersonFactory {
    public static AbstractHuman createPerson(String role){
        if (role.equalsIgnoreCase("student")){
            return PersonGenerator.generateStudent();
        } else if (role.equalsIgnoreCase("tutor")) {
            return PersonGenerator.generateTutor();
        }

        else{
            return null;
        }
    }
}
