import java.util.ArrayList;

public class Borrower {
    private String name;
    private int capacity;
    private ArrayList<Book> collection;

    public Borrower(String name, int capacity){
       this.name = name;
       this.capacity = capacity;
       this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    public int totalCapacity() {
        return this.collection.size();
    }
    public void takeBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.collection.add(book);
    }
}
