public class Book {
    public static final String askBook = "Would you like enter book information? (Y/N)";
    public static final String bookName = "What is the book name?";
    public static final String bookGenre = "What is genre of the book?";
    public static final String bookPages = "How many pages does book have?";

    //Create 3 args custom constructor here
    //YOUR CODE HERE

    public Book(String name, String genre, int pages){
        this.name = name;
        this.genre = genre;
        this.pages = pages;
    }

    //Define instance variables here
    //YOUR CODE HERE
    //Book  = new Employee("John Doe", "Manager", 45, company1);

    private String name;
    private String genre;
    private int pages;

    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    public static Book getBook() {
        String askBookName = ScannerHelper.getString(bookName);
        String askBookGenre = ScannerHelper.getString(bookGenre);
        int askBookPages = ScannerHelper.getInt(bookPages);

        return new Book(askBookName,askBookGenre,askBookPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }

}
