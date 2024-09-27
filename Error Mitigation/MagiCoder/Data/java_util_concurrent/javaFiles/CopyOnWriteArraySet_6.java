import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_6 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        System.out.println(set.isEmpty()); // Output: true
        
        set.add("Hello");
        System.out.println(set.isEmpty()); // Output: false
    }
}
