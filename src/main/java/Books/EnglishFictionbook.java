package Books;

public class EnglishFictionbook extends Fictionbook {
    final String level; // Bachelor's or Master's

    public EnglishFictionbook(String title, String author, int publishYear, String level) {
        super(title, author, publishYear, "English");
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String getInfo(){
        return String.format("%s by %s, %d, %s", this.getTitle(), this.getAuthor(), this.getPublishYear(), this.getLevel());
    }
}

