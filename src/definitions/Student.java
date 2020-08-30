/*  Created by IntelliJ IDEA.
 *  User: Khushi Agarwal (khushia1721)
 *  Date: 30/08/20
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    private String firstNameOfTheStudent;
    private String middleNameOfTheStudent;
    private String lastNameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBooksIssuedByStudent;

    public String getFirstNameOfTheStudent() {
        return firstNameOfTheStudent;
    }

    public String getMiddleNameOfTheStudent() {
        return middleNameOfTheStudent;
    }

    public String getLastNameOfTheStudent() {
        return lastNameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBooksIssuedByStudent() {
        return namesOfBooksIssuedByStudent;
    }
}
