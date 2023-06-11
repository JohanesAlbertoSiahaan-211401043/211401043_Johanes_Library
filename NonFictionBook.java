public class NonFictionBook extends Books {
    private String subject;

    public NonFictionBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    @Override
    public void getInfo(){
        System.out.println("# Non Fiction book - " + this.getTitle() + " - " + this.getAuthor() + " - " + this.getYear());
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}