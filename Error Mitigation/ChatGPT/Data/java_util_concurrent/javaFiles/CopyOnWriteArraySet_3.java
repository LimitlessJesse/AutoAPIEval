import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_3 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        System.out.println(set.contains("Hello")); // Output: true
    }
}
