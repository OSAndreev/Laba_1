package Books;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class FictionbookFactory {
    private static final List<String> engficliteratureList = Arrays.asList(
            "Harper Lee - To Kill a Mockingbird",
            "George Orwell - 1984",
            "Jane Austen - Pride and Prejudice",
            "F. Scott Fitzgerald - The Great Gatsby",
            "George Orwell - Animal Farm",
            "Aldous Huxley - Brave New World",
            "J.D. Salinger - The Catcher in the Rye",
            "William Golding - Lord of the Flies",
            "J.R.R. Tolkien - The Hobbit",
            "Virginia Woolf - To the Lighthouse",
            "Herman Melville - Moby-Dick",
            "Emily Brontë - Wuthering Heights",
            "Mary Shelley - Frankenstein",
            "Charlotte Brontë - Jane Eyre",
            "Oscar Wilde - The Picture of Dorian Gray",
            "Sylvia Plath - The Bell Jar",
            "J.R.R. Tolkien - The Lord of the Rings",
            "Charles Dickens - A Tale of Two Cities",
            "C.S. Lewis - The Chronicles of Narnia",
            "Charles Dickens - Great Expectations",
            "Agatha Christie - Murder on the Orient Express",
            "Ernest Hemingway - The Old Man and the Sea",
            "Mark Twain - The Adventures of Huckleberry Finn",
            "Gabriel Garcia Marquez - One Hundred Years of Solitude",
            "J.K. Rowling - Harry Potter and the Philosopher's Stone",
            "Ernest Hemingway - The Sun Also Rises",
            "Gabriel Garcia Marquez - Love in the Time of Cholera",
            "Jane Austen - Sense and Sensibility",
            "Kurt Vonnegut - Slaughterhouse-Five",
            "Margaret Atwood - The Handmaid's Tale",
            "George R.R. Martin - A Game of Thrones",
            "Aldous Huxley - Island",
            "Haruki Murakami - Norwegian Wood"
    );

    private static final List<String> englishLevels = Arrays.asList(
            "Beginner",
            "Elementary",
            "Pre-Intermediate",
            "Intermediate",
            "Upper-Intermediate",
            "Advanced",
            "Proficiency"
    );
    private static final List<String> rusficliteratureList = Arrays.asList(
            "Лев Толстой - Война и мир",
            "Федор Достоевский - Преступление и наказание",
            "Антон Чехов - Три сестры",
            "Александр Пушкин - Евгений Онегин",
            "Михаил Булгаков - Мастер и Маргарита",
            "Николай Гоголь - Мертвые души",
            "Иван Тургенев - Отцы и дети",
            "Александр Солженицын - Архипелаг ГУЛАГ",
            "Анна Ахматова - Реквием",
            "Борис Пастернак - Доктор Живаго",
            "Алексей Толстой - Петр Первый",
            "Иван Бунин - Темные аллеи",
            "Андрей Платонов - Чевенгур",
            "Сергей Есенин - Вечером на рейде",
            "Михаил Шолохов - Тихий Дон",
            "Александр Блок - Двенадцать",
            "Владимир Маяковский - Облако в штанах",
            "Николай Лесков - Левша",
            "Иван Бунин - Темные аллеи",
            "Борис Акунин - Азазель",
            "Иван Бунин - Господин из Сан-Франциско",
            "Михаил Лермонтов - Герой нашего времени",
            "Антон Чехов - Вишневый сад",
            "Максим Горький - Мать",
            "Сергей Довлатов - Записные книжки",
            "Михаил Жванецкий - Все смешалось в доме Облонских",
            "Николай Гумилев - Стихотворения",
            "Федор Сологуб - Мелкий бес",
            "Иван Бунин - Темные аллеи",
            "Борис Пастернак - Доктор Живаго");

    private static Random random = new Random();
    public static Book createBook(String lang){
        if (Objects.equals(lang, "english")){
            return createEngBook();
        } else if (Objects.equals(lang, "russian")) {
            return createRusBook();
        }
        else {
            return null;
        }
    }
    public static EnglishFictionbook createEngBook(){
        String randomBook = engficliteratureList.get(random.nextInt(engficliteratureList.size()));
        String[] parts= randomBook.split(" - ");
        String author = parts[0];
        String title = parts[1];
        String randomEnglishLevel = englishLevels.get(random.nextInt(englishLevels.size()));
        int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
        return new EnglishFictionbook(title, author, randomYear, randomEnglishLevel);
    }

    public static RussianFictionbook createRusBook(){
        String randomBook = rusficliteratureList .get(random.nextInt(rusficliteratureList.size()));
        String[] parts= randomBook.split(" - ");
        String author = parts[0];
        String title = parts[1];
        int randomYear = random.nextInt(2023 - 1960 + 1) + 1960;
        return new RussianFictionbook(title, author, randomYear);
    }}
