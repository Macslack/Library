import java.util.ArrayList;

public class Library {
    private String name;
    private int capacity;
    private ArrayList<Book> collection;

    public Library(String name, Integer capacity){
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }
    public int totalCollection() {
        return this.collection.size();
    }
    public void addBook(Book book) {
        if (totalCollection() < 20)
        this.collection.add(book);
    }
    public int getCapacity() {
        return capacity;
    }
    public Book removeBook() {
        return this.collection.remove(0);
    }

}
