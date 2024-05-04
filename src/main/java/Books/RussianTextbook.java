package Books;

public class RussianTextbook extends Textbook {
    public RussianTextbook(String subject, String literatureType, String author, int publishYear) {
        super(literatureType + " " + subject, author, publishYear, "Russian");
    }
}