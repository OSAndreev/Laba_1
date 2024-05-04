package Books;

public class EnglishTextbook extends Textbook {
    private String level; // Bachelor's or Master's

    public EnglishTextbook(String university, String coursera, String author, int publishYear, String level) {
        super(author + " " + university + ": " + coursera  + " for " + level + " (" + publishYear + ")",
                author, publishYear, "English");
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

