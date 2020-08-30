/*  Created by IntelliJ IDEA.
 *  User: Priyansh Kushwaha
 *  Date: 30/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student {
        definitions.Student studentObject = new definitions.Student();
        private String studentFirstName, studentMiddleName, studentLastName;
        private long universityRollNumber;
        private int numberOfBooksIssued;
        private Book[] name ;
        // Constructor methods: used to initialise the values(field) of an object.

        // 1. non-Parameter constructor : it has no parameter.
        public Student(){
                studentFirstName = "Priyansh";
                studentMiddleName = "Singh";
                studentLastName = "Kushwaha";
                universityRollNumber = 191500604;
                numberOfBooksIssued = 5;
                this.name = new Book[5];
                for (int index = 0; index < name.length; index++) {
                        name[index] = new Book("IssuedBook"+ (index+1));
                }
        }
        // 2. Parameterized constructor : it has some parameters.
        public Student(String studentFirstName, String studentMiddleName, String studentLastName, long universityRollNumber, int numberOfBooksIssued, Book[] name) {
                this.studentFirstName = studentFirstName;
                this.studentMiddleName = studentMiddleName;
                this.studentLastName = studentLastName;
                this.universityRollNumber = universityRollNumber;
                this.numberOfBooksIssued = numberOfBooksIssued;
                this.name = new Book[5];
                for (int index = 0; index < name.length; index++) {
                        name[index] = new Book("Book " + (index + 1));
                }
        }

}
