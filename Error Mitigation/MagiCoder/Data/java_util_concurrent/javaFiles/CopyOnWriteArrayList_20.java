import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_20 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Hello", "World", "Java"));
        System.out.println("Original list: " + list);

        // Removing elements from the list
        list.removeAll(Arrays.asList("Hello", "Java"));
        System.out.println("List after removing elements: " + list);
    }
}
