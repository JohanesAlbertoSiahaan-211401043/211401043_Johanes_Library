import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.event.AncestorEvent;

public class Main {
    public static Scanner input = new Scanner(System.in);
    static User user = null;
    static List<Books> booksList = new ArrayList<>();
    static List<AutobiographyBook> autobiographys = new ArrayList<>();
    static List<EducationalBook> educationals = new ArrayList<>();
    static List<FantasyBook> fantasys = new ArrayList<>();
    static List<FictionBook> fictions = new ArrayList<>();
    static List<NonFictionBook> nonFictions = new ArrayList<>();
    static List<RomanceBook> romances = new ArrayList<>();
    static List<String> borrowed = new ArrayList<>();
    static List<String> titles = new ArrayList<>();
    static List<User> users = new ArrayList<>();

    public static void line(){
        System.out.println("----------------------------------------------------------------");
    }

    public static int selectMenu(){
        line();
        System.out.println("Menu");
        line();
        System.out.println("1. See book list");
        System.out.println("2. Add new book");
        System.out.println("3. List of borrowed books");
        System.out.println("4. See users");
        System.out.println("5. Exit");
        System.out.print("Choose : ");
        int menuChosen = input.nextInt();
        input.nextLine();

        return menuChosen;
    }

    public static void selectedMenu(int select){
        if (select == 1){
            line();
            for (int i = 0; i < booksList.size(); i++) {
                Books books = booksList.get(i);
                books.getInfo();
                System.out.println();
            }
            for (int i = 0; i < nonFictions.size(); i++) {
                NonFictionBook nonFiction = nonFictions.get(i);
                nonFiction.getInfo();
            }
            for (int i = 0; i < autobiographys.size(); i++) {
                AutobiographyBook autobigraphy = autobiographys.get(i);
                autobigraphy.getInfo();
            }
            for (int i = 0; i < educationals.size(); i++) {
                EducationalBook educational = educationals.get(i);
                educational.getInfo();
            }
            for (int i = 0; i < fictions.size(); i++) {
                FictionBook fiction = fictions.get(i);
                fiction.getInfo();
            }
            for (int i = 0; i < fantasys.size(); i++) {
                FantasyBook fantasy = fantasys.get(i);
                fantasy.getInfo();
            }
            for (int i = 0; i < romances.size(); i++) {
                RomanceBook romance = romances.get(i);
                romance.getInfo();
            }
            int selected = selectMenu();
            selectedMenu(selected);
        } else if(select == 2) {
            System.out.println("add new book");
            System.out.println("book lists: ");
            line();
            System.out.println("1. general book");
            System.out.println("2. Non fiction book");
            System.out.println("3. Autobiography book");
            System.out.println("4. Educational book");
            System.out.println("5. Fiction book");
            System.out.println("6. Romance book");
            System.out.println("7. Fantasy book");
            System.out.print("Choose: ");
            int chosen = input.nextInt();

            String title, author, field, subject, genre, person, mood, ending;
            int year;
            line();
            if (chosen == 1) {
                System.out.print("");
                String space = input.nextLine();
                System.out.print("title: ");
                title = input.nextLine();
                System.out.print("author: ");
                author = input.nextLine();
                System.out.print("year: ");
                year = input.nextInt();
                Books book = new Books(title, author, year);
                booksList.add(book);
                titles.add(book.getTitle());
            } else if (chosen == 2) {
                System.out.print("title: ");
                title = input.next();
                System.out.print("author: ");
                author = input.next();
                System.out.print("year: ");
                year = input.nextInt();
                System.out.print("subject: ");
                subject = input.next();
                NonFictionBook nonFictionBook = new NonFictionBook(title, author, year, subject);
                nonFictions.add(nonFictionBook);
                titles.add(nonFictionBook.getTitle());
            } else if (chosen == 3) {
                System.out.print("title: ");
                title = input.next();
                System.out.print("author: ");
                author = input.next();
                System.out.print("year: ");
                year = input.nextInt();
                System.out.print("subject: ");
                subject = input.next();
                System.out.print("person: ");
                person = input.next();
                AutobiographyBook autobiographyBook = new AutobiographyBook(title, author, year, subject, person);
                autobiographys.add(autobiographyBook);
                titles.add(autobiographyBook.getTitle());
            } else if (chosen == 4) {
                System.out.print("title: ");
                title = input.next();
                System.out.print("author: ");
                author = input.next();
                System.out.print("year: ");
                year = input.nextInt();
                System.out.print("subject: ");
                subject = input.next();
                System.out.print("field: ");
                field = input.next();
                EducationalBook educationalBook = new EducationalBook(title, author, year, subject, field);
                educationals.add(educationalBook);
                titles.add(educationalBook.getTitle());
            } else if (chosen == 5) {
                System.out.print("title: ");
                title = input.next();
                System.out.print("author: ");
                author = input.next();
                System.out.print("year: ");
                year = input.nextInt();
                System.out.print("genre: ");
                genre = input.next();
                FictionBook fictionBook = new FictionBook(title, author, year, genre);
                fictions.add(fictionBook);
                titles.add(fictionBook.getTitle());
            } else if (chosen == 6) {
                System.out.print("title: ");
                title = input.next();
                System.out.print("author: ");
                author = input.next();
                System.out.print("year: ");
                year = input.nextInt();
                System.out.print("genre: ");
                genre = input.next();
                System.out.print("ending: ");
                ending = input.next();
                RomanceBook romance = new RomanceBook(title, author, year, genre, ending);
                romances.add(romance);
                titles.add(romance.getTitle());
            } else if (chosen == 7) {
                System.out.print("title: ");
                title = input.next();
                System.out.print("author: ");
                author = input.next();
                System.out.print("year: ");
                year = input.nextInt();
                System.out.print("genre: ");
                genre = input.next();
                System.out.print("mood: ");
                mood = input.next();
                FantasyBook fantasy = new FantasyBook(title, author, year, genre, mood);
                fantasys.add(fantasy);
                titles.add(fantasy.getTitle());
            } else {
                System.out.println("Your input doesn't exist");
            }
            int selected = selectMenu();
            selectedMenu(selected);
        } else if (select == 3){
            if (borrowed.size() == 0){
                System.out.println("***There's no book borrowed***");
            } else {
                for(int i = 0; i < borrowed.size(); i++){
                    System.out.println("# " + borrowed.get(i));
                }
            }
            int selected = selectMenu();
            selectedMenu(selected);
        } else if (select == 4){
            System.out.println("Users");
            for(int i = 0; i < users.size(); i++){
                System.out.println("# " + users.get(i).getUsername() + " - " + users.get(i).getPassword());
            }
            int selected = selectMenu();
            selectedMenu(selected);
        } else if (select == 5){

        } else {
            System.out.println("Your input doesn't exist");
            int selected = selectMenu();
            selectedMenu(selected);
        }
    }
    
    public static void chooseRole(){
        line();
        System.out.println("Welcome to Library JO..!!!");
        System.out.println("Select your role:");
        line();
        System.out.println("1. Admin");
        System.out.println("2. Guest");
        System.out.print("Choose(1/2): ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            User user = new User("admin", "123", "admin@gmail.com", "admin");

            line();
            System.out.print("username: ");
            String username = input.nextLine();
            System.out.print("password: ");
            String password = input.nextLine();

            if (username.equals("admin") && password.equals("123")){
                int selected = selectMenu();
                selectedMenu(selected);
                chooseRole();
            } else {
                System.out.println("You're not admin");
            }
            
        } else if (choice == 2) {
            System.out.print("Do you already have an account? [y/n] : ");
            String ans = input.next();
            if (ans.equals("y") || ans.equals("Y")){
                System.out.print("");
                String space = input.nextLine();
                System.out.print("Username: ");
                String name = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();
                
                Boolean contained = false;

                for (int i = 0; i < users.size(); i++){
                    if (users.get(i).getUsername().equals(name) && users.get(i).getPassword().equals(password)){
                        contained = true;
                    }
                }

                System.out.println("Halo " + name);

                if (!contained){
                    System.out.println("Your liar");
                    return;
                }

            } else if (ans.equals("n") || ans.equals("N")){
                System.out.println("Input guest data:");
                System.out.print("");
                String space = input.nextLine();;
                System.out.print("Username: ");
                String username = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();
                System.out.print("Email: ");
                String email = input.nextLine();
                String role = "guest";

                User user = new User(username, password, email, role);
                users.add(user);
            } else {
                System.out.println("Your input doesn't exist");
                chooseRole();
            }

            line();
            System.out.println("Book list");            
            line();
            for (int i = 0; i < booksList.size(); i++) {
                Books books = booksList.get(i);
                books.getInfo();
                System.out.println();
            }
            for (int i = 0; i < nonFictions.size(); i++) {
                NonFictionBook nonFiction = nonFictions.get(i);
                nonFiction.getInfo();
            }
            for (int i = 0; i < autobiographys.size(); i++) {
                AutobiographyBook autobigraphy = autobiographys.get(i);
                autobigraphy.getInfo();
            }
            for (int i = 0; i < educationals.size(); i++) {
                EducationalBook educational = educationals.get(i);
                educational.getInfo();
            }
            for (int i = 0; i < fictions.size(); i++) {
                FictionBook fiction = fictions.get(i);
                fiction.getInfo();
            }
            for (int i = 0; i < fantasys.size(); i++) {
                FantasyBook fantasy = fantasys.get(i);
                fantasy.getInfo();
            }
            for (int i = 0; i < romances.size(); i++) {
                RomanceBook romance = romances.get(i);
                romance.getInfo();

            line();
            System.out.print("Type the title you want to borrow: ");
            String title = input.nextLine();

            if (titles.contains(title)){
                System.out.println("***Success and happy to read***");
                borrowed.add(title);
            } else {
                System.out.println(title + " doesn't exist");
            }
            }
            chooseRole();
        } else {
            System.out.println("Your input doesn't exist");
            chooseRole();
        }
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Books book = new Books("Sekolah Dasar", "JAShn", 2019);
        booksList.add(book);
        titles.add(book.getTitle());
        FictionBook fictionBook = new FictionBook("Kucing Terbang", "Johanes", 2000, "Classic");   
        fictions.add(fictionBook);
        titles.add(fictionBook.getTitle());
        NonFictionBook nonFictionBook = new NonFictionBook("Asal Usul Manusia", "Alberto", 2011, "Anthropology");    
        nonFictions.add(nonFictionBook);
        titles.add(nonFictionBook.getTitle());
        EducationalBook educationalBook = new EducationalBook("Pengenalan Ilmu Komputer", "Siahaan", 2022, "Ilmu Komputer", "Programming");
        educationals.add(educationalBook);
        titles.add(educationalBook.getTitle());
        AutobiographyBook autobiographyBook = new AutobiographyBook("Hebat", "Jalberto", 2018, "Biography", "Jalberto");      
        autobiographys.add(autobiographyBook);
        titles.add(autobiographyBook.getTitle());
        RomanceBook romance = new RomanceBook("Cintaku", "Johanes Siahaan", 2000, "Classic Romance", "sad");        
        romances.add(romance);
        titles.add(romance.getTitle());
        FantasyBook fantasy = new FantasyBook("Harry Potter", "J.K. Rowling", 1997, "Adventure", "happy");
        fantasys.add(fantasy);
        titles.add(fantasy.getTitle());

        chooseRole();
    }
}