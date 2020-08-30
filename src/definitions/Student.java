/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String firstNameOfTheStudent;
    private String middleNameOfTheStudent;
    private String lastNameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBooksIssuedByStudent;

    public Student() {
        this.firstNameOfTheStudent = firstNameOfTheStudent;
        this.middleNameOfTheStudent = middleNameOfTheStudent;
        this.lastNameOfTheStudent = lastNameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
        this.namesOfBooksIssuedByStudent = namesOfBooksIssuedByStudent;
    }

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

    @Override
    public String toString() {
        return String.format(
                " First Name Of The Student : %s, Middle Name Of The student : %s, Last Name Of The Student : %s," +
                        "University Roll Number Of The Student : %d, Number Of Books Issued By The Student : %d" +
                        "Name Of The Books Issued By The Student : %s",
                getFirstNameOfTheStudent(), getMiddleNameOfTheStudent(), getLastNameOfTheStudent()
                , getUniversityRollNumberOfTheStudent(), getNumberOfBooksIssuedByStudent(),
                Arrays.toString(getNamesOfBooksIssuedByStudent())
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumberOfTheStudent() == student.getUniversityRollNumberOfTheStudent() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(getFirstNameOfTheStudent(), student.getFirstNameOfTheStudent()) &&
                Objects.equals(getMiddleNameOfTheStudent(), student.getMiddleNameOfTheStudent()) &&
                Objects.equals(getLastNameOfTheStudent(), student.getLastNameOfTheStudent()) &&
                Arrays.equals(getNamesOfBooksIssuedByStudent(), student.getNamesOfBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfTheStudent(), getMiddleNameOfTheStudent(), getLastNameOfTheStudent(),
                getUniversityRollNumberOfTheStudent(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getNamesOfBooksIssuedByStudent());
        return result;
    }

    /**
     * This method will show all the books which is issued by the Student.
     */

    public void showIssuedBooksByStudent() {
        if (getNumberOfBooksIssuedByStudent() == 0) {
            System.out.println("Sorry, you haven't issued any book yet.");
        } else {
            System.out.println("These are the books issued by you: ");
        }

    }
}
