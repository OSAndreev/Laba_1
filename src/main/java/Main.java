import Books.EnglishTextbook;
import Books.RussianTextbook;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Library library = new Library(true);
        new LibraryGUI(library);
    }
}
