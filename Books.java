public class Books {
    private String title, author;
    private int year;

    public Books(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void getInfo(){
        System.out.print("# General book - " + title + " - " + author + " - " + year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
