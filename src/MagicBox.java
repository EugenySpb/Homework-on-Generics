import java.util.Random;

public class MagicBox<T> {
    private final T[] items;
    private final int capacity;
    private int size;

    public MagicBox(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.items = (T[]) new Object[capacity];
    }

    public boolean add(T item) {
        items[size] = item;
        if (size < capacity) {
            size++;
            return true;
        } else {
            return false;
        }
    }

    public T pick() {
        if (size < capacity) {
            throw new RuntimeException("Коробка не полная. Осталось заполнить " + (capacity - size) + " ячеек.");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(capacity);
            return items[randomInt];
        }
    }
}
