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
        public Student(String studentFirstName, String studentMiddleName, String studentLastName) {
                this.studentFirstName = studentFirstName;
                this.studentMiddleName = studentMiddleName;
                this.studentLastName = studentLastName;
        }

        //add getter and setter methods to read and write the value of private fields respectively

        /**
         * This method returns the first name of the student.
         *
         * @return The first name of the student.
         */

        public String getStudentFirstName() {
                return this.studentFirstName;
        }

        /**
         * This method sets the first name of student.
         *
         * @param studentFirstName The first name of the student that you want to set.
         */

        public void setStudentFirstName(String studentFirstName) {
                this.studentFirstName = studentFirstName;
        }

        /**
         * This method returns the middle name of the student.
         *
         * @return The middle name of the student.
         */

        public String getStudentMiddleName() {
                return this.studentMiddleName;
        }

        /**
         * This method sets the middle name of student.
         *
         * @param studentMiddleName The middle name of the student that you want to set.
         */

        public void setStudentMiddleName(String studentMiddleName) {
                this.studentMiddleName = studentMiddleName;
        }

        /**
         * This method returns the last name of the student.
         *
         * @return The last name of the student.
         */

        public String getStudentLastName() {
                return this.studentLastName;
        }
        /**
         * This method sets the last name of student.
         * @param studentLastName The Last Name of student that you want to set.
         */
        public long getUniversityRollNumber() {
                return this.universityRollNumber;
        }

        /**
         * This method sets the university roll number of student.
         *
         * @param universityRollNumber The university roll number of the student that you want to set.
         */
        public void setUniversityRollNumber(long universityRollNumber) {
                this.universityRollNumber = universityRollNumber;
        }

        /**
         * This method returns the number of books issued by the student.
         *
         * @return The number of books issued by the student.
         */

        public int getNumberOfBooksIssued() {
                return this.numberOfBooksIssued;
        }

        /**
         * This method sets the number of books issued by the student.
         *
         * @param numberOfBooksIssued The number of books issued by the student that you want to given.
         */

        public void setNumberOfBooksIssued(int numberOfBooksIssued) {
                this.numberOfBooksIssued = numberOfBooksIssued;
        }

        /**
         * This method returns all the name of books issued by the student.
         *
         * @return All the name of books issued by the student.
         */


}
