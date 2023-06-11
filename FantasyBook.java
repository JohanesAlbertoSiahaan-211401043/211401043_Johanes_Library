public class FantasyBook extends FictionBook {
    private String mood;

    public FantasyBook(String title, String author, int year, String genre, String mood) {
        super(title, author, year, genre);
        this.mood = mood;
    }

    @Override
    public void getInfo() {
        System.out.println("# Fantasy book - " + getTitle() + " - " + getGenre() + " - " + getAuthor() + " - " + getYear());
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
