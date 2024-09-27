import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_1 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        System.out.println(set.add("Hello")); // Output: true
        System.out.println(set.add("Hello")); // Output: false
    }
}
