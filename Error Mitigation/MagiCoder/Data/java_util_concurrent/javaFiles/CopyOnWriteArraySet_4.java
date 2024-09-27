import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_4 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        System.out.println(set.contains("Hello"));  // Output: true
        System.out.println(set.contains("World"));  // Output: false
    }
}
