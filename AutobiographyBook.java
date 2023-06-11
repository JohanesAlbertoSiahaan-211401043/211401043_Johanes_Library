public class AutobiographyBook extends NonFictionBook {
    private String person;

    public AutobiographyBook(String title, String author, int year, String subject, String person) {
        super(title, author, year, subject);
        this.person = person;
    }

    @Override
    public void getInfo(){
        System.out.println("# Autobiography book - " + this.getTitle() + " - " + this.getAuthor() + " - " + this.getYear());
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
