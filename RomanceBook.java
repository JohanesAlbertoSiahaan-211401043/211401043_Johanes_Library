public class RomanceBook extends FictionBook {
    private String ending;

    public RomanceBook(String title, String author, int year, String genre, String ending) {
        super(title, author, year, genre);
        this.ending = ending;
    }
    
    @Override 
    public void getInfo(){
        System.out.println("# Romance book - " + this.getTitle() + " - " + this.getAuthor() + " - " + this.getYear());
    }

    public void setEnding(String ending) {
        super.setGenre(ending);
    }

    public String getEnding(String ending){
        return this.ending;
    }
}
