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
}
