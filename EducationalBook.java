public class EducationalBook extends NonFictionBook {
    private String field;

    public EducationalBook(String title, String author, int year, String subject, String field) {
        super(title, author, year, subject);
        this.field = field;
    }

    @Override
    public void getInfo(){
        System.out.println("# Educational book - " + this.getTitle() + " - " + this.getAuthor() + " - " + this.getYear());
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
