public class FictionBook extends Books {
    private String genre;

    public FictionBook(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void getInfo(){
        System.out.println("# Fiction book - " + this.getGenre() + " - " + this.getTitle() + " - " + this.getAuthor() + " - " + this.getYear());
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}