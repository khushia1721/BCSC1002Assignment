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

    public void setFirstNameOfTheStudent(String firstNameOfTheStudent) {
        this.firstNameOfTheStudent = firstNameOfTheStudent;
    }

    public String getMiddleNameOfTheStudent() {
        return middleNameOfTheStudent;
    }

    public void setMiddleNameOfTheStudent(String middleNameOfTheStudent) {
        this.middleNameOfTheStudent = middleNameOfTheStudent;
    }

    public String getLastNameOfTheStudent() {
        return lastNameOfTheStudent;
    }

    public void setLastNameOfTheStudent(String lastNameOfTheStudent) {
        this.lastNameOfTheStudent = lastNameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public void setUniversityRollNumberOfTheStudent(long universityRollNumberOfTheStudent) {
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBooksIssuedByStudent() {
        return namesOfBooksIssuedByStudent;
    }

    public void setNamesOfBooksIssuedByStudent(Book[] namesOfBooksIssuedByStudent) {
        this.namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;
    }


}
