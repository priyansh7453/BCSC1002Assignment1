  /*  Created by IntelliJ IDEA.
   *  User: Priyansh kushwaha
   *  Date: 30/08/20
   *  Time: 3:50 PM
   *  File Name : Book.java
   * */
  package definitions;

   import java.util.*;

public class Book {

   //  component of a definition class in java.
    // 1. private fields.
    // 2. getter methods for private fields.
    // 3. setter methods for private fields.
    // 4. Constructor for initializing the fields of an objects.
    // 5. the toString() methods.
    // 6. th equals() and the hashCode() methods.

    private String nameOfBook;
    private String authorOfBook;
    private String thirteenDIgitsISBNNumberOfBook;

    // Constructor method : used to initialise the values(field) of an objects.

    // 1. non-parameterized constructor : it has no parameter.
    public Book(){
        nameOfBook = "beginning programing with java";
        authorOfBook = "barry burd ";
        thirteenDIgitsISBNNumberOfBook = "5790760157273";

    }

    // 2. Parameterized constructor : it has some parameters.
    public Book(String nameOfBook, String authorOfBook, String thirteenDigitISBNNumberOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
        this.thirteenDIgitsISBNNumberOfBook = thirteenDigitISBNNumberOfBook;
    }
    public Book(String nameOfBook){
        this.nameOfBook = nameOfBook;
    }
    //1. The getter method : it is used to read the value of a private field.
    // Observer methods / Accessor Methods

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */

    public String getNameOfBook() {
        return this.nameOfBook;
    }

    //2. The setter method : used to write the value of a private field.
    // Transformer methods / Mutator Methods

    /**
     * This method will change the book name
     *
     * @param nameOfBook The name of the book that you want to given
     */

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    /**
     * This method returns the name of the author of the book.
     *
     * @return The name of author of the book.
     */

    public String getAuthorOfBook() {
        return this.authorOfBook;
    }

    /**
     * This method will change the author name of book
     *
     * @param authorOfBook The author name of the book that you want to given
     */

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    /**
     * This method returns the ISBN number of the book
     *
     * @return ISBN number of the book
     */

    public String getThirteenDigitISBNNumberOfBook() {
        return this.thirteenDIgitsISBNNumberOfBook;
    }

    /**
     * This method will change the ISBN number of book
     *
     * @param thirteenDigitISBNNumberOfBook ISBN number of the book that you want to given
     */

    public void setThirteenDigitISBNNumberOfBook(String thirteenDigitISBNNumberOfBook) {
        this.thirteenDIgitsISBNNumberOfBook = thirteenDigitISBNNumberOfBook;
    }

    public void getData() {
        System.out.println("Book Name: " + nameOfBook);
    }



}
