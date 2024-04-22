public abstract class Fictionbook implements Book {
    protected String title;
    protected String author;
    protected int publishYear;
    protected String language;
    protected String type;

    public Fictionbook(String title, String author, int publishYear, String language) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.language = language;
        this.type = "Fiction";
    }

    @Override
    public int getPublishYear() {
        return publishYear;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getInfo(){
        return String.format("%s by %s, %d", this.getTitle(), this.getAuthor(), this.getPublishYear());
    }
}