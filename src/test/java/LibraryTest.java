import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;


    @Before
    public void before() {
        library = new Library("Amsterdam", 20);
        book = new Book();
    }
    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, library.totalCollection());
    }
    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.totalCollection());

    }
    @Test
    public void getCapacity(){
        assertEquals(20, library.getCapacity());

    }
    @Test
    public void canNotAddBook() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(20, library.totalCollection());
    }
    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.totalCollection());

    }
}
