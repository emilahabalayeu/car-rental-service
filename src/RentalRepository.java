import java.util.ArrayList;
import java.util.List;

public class RentalRepository<T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
        System.out.println("Added: " + item);
    }

    public T get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public List<T> getAll() {
        return items;
    }
}