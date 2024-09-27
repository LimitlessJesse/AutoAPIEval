import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_14 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set1 = new CopyOnWriteArraySet<>();
        set1.add("Hello");
        set1.add("World");

        CopyOnWriteArraySet<String> set2 = new CopyOnWriteArraySet<>();
        set2.add("Hello");
        set2.add("World");

        System.out.println(set1.equals(set2)); // Output: true
    }
}
