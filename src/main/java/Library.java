import java.util.*;
import java.util.List;
import Books.FictionbookFactory;
import Books.FictionbookFactory;
import com.github.javafaker.Faker;
import Books.TextbooksFactory;

public class Library {
    private ArrayList<AbstractHuman> users;
    private List<String> roles = Arrays.asList("student", "tutor");
    public Library(boolean generate){
        Faker faker = new Faker(Locale.forLanguageTag("ru-RU"));
        List<String> languages = Arrays.asList("russian", "english");
        Random random = new Random();
        this.users = new ArrayList<>();
        if(generate){
            for (int i = 0; i < faker.number().numberBetween(5, 20); i++) {
                this.users.add(PersonFactory.createPerson(roles.get(random.nextInt(roles.size()))));
            };
            for (AbstractHuman user:
                 users) {
                for (int i = 0; i < faker.number().numberBetween(1, 5); i++) {
                    user.addBook(FictionbookFactory.createBook(languages.get(random.nextInt(languages.size()))));
                };
                for (int i = 0; i < faker.number().numberBetween(1, 5); i++) {
                    user.addBook(TextbooksFactory.createBook(languages.get(random.nextInt(languages.size()))));
                }
            }
        }
    }

    public ArrayList<AbstractHuman> getUsers() {
        return users;
    }
}
