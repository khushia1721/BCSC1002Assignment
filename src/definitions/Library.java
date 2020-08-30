/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package definitions;

import java.util.Arrays;

public class Library {

    private Book[] booksThatAreCurrentlyAvailable;

    public Library() {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    public Book[] getBooksThatAreCurrentlyAvailable() {
        return booksThatAreCurrentlyAvailable;
    }

    public void setBooksThatAreCurrentlyAvailable() {
        this.booksThatAreCurrentlyAvailable = booksThatAreCurrentlyAvailable;
    }

    @Override
    public String toString() {
        return String.format(
                "Books That Are Currently Available : %s", Arrays.toString(booksThatAreCurrentlyAvailable)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailable(), library.getBooksThatAreCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailable());
    }
}
