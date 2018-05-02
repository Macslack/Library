import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Callum", 20);
    }
    @Test
    public void getName() {
        assertEquals("Callum", borrower.getName());
    }
    @Test
    public void getCapacity() {
        assertEquals(20, borrower.getCapacity());
    }
    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, borrower.totalCapacity());
    }
    @Test
    public void canTakeBookFromLibrary() {
        borrower.takeBookFromLibrary(library);
        assertEquals(1, borrower.totalCapacity());
    }


}
