/*  Created by IntelliJ IDEA.
 *  User: Khushi Agarwal (khushia1721)
 *  Date: 30/08/20
 *  File Name : Library.java
 * */
package definitions;

public class Library {

    private Book[] booksThatAreCurrentlyAvailable;

    public Library(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable(Book[] booksThatAreCurrentlyAvailable) {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }


}
