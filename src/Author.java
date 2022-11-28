import java.util.ArrayList;
import java.util.Scanner;

public class Author {


    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */
    public static final String authorFirstName = "What is your favorite author’s first name?";
    public static final String authorLatName = "What is your favorite author’s last name?";
    public static final String nationality = "Where is your favorite author from?";
    public static final String stilLive = "Is your favorite author alive? Y/N";
    public static final String authorAge = "How old is your favorite author?";


    //Create 6 args custom constructor here
    //YOUR CODE HERE
    public Author( String firstname, String lastName, String country,boolean isAlive, int age, ArrayList listOfBooks){
        this.firstName = firstname;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.listOfBooks = listOfBooks;

    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public  String country;
    public  boolean isAlive;
    public int age;
    public ArrayList<Book> listOfBooks;


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE

    public static Author newAuthor(){
        String fName = ScannerHelper.getString(authorFirstName);
        String lName = ScannerHelper.getString(authorLatName);
        String nation = ScannerHelper.getString(nationality);
        String alive = ScannerHelper.getString(stilLive);

        boolean isAlive = false;
        int age = 0;
        if (alive.toLowerCase().equals("y")){
            isAlive = true;
            age = ScannerHelper.getInt(authorAge);
        } else if (alive.equalsIgnoreCase("N")) {
            isAlive = false;
        }

        ArrayList<Book> books = new ArrayList<>();
        do {
            String fBook = ScannerHelper.getString(Book.askBook);
            if(fBook.equalsIgnoreCase("N"))
                break;
            books.add(Book.getBook());
        }while(true);

        return new Author(fName,lName,nation,isAlive,age,books);
    }


    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive='" + isAlive + '\'' +
                ", age=" + age +
                ", listOfBooks='" + listOfBooks + '\'' +
                '}';
    }
}