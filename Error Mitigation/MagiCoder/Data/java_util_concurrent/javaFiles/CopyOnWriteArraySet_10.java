import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_10 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>(Arrays.asList("Hello", "World", "Java"));
        CopyOnWriteArraySet<String> set2 = new CopyOnWriteArraySet<>(Arrays.asList("Hello", "Java"));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        boolean result = set1.retainAll(set2);

        System.out.println("Set 1 after retainAll: " + set1);
        System.out.println("Result: " + result);
    }
}
