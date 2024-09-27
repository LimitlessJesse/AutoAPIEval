import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_9 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>(Arrays.asList("Hello", "World", "Java"));
        System.out.println("Original Set: " + set);

        // Create a new collection
        Collection<String> collection = Arrays.asList("Hello", "Java");

        // Remove all elements in the collection from the set
        boolean isRemoved = set.removeAll(collection);

        System.out.println("Set after removeAll: " + set);
        System.out.println("Is removed: " + isRemoved);
    }
}
