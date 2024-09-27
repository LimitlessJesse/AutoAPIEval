import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_24 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Concurrent");
        list.add("Programming");

        System.out.println("Before removing: " + list);

        // Remove all elements that start with 'J'
        list.removeIf(s -> s.startsWith("J"));

        System.out.println("After removing: " + list);
    }
}
