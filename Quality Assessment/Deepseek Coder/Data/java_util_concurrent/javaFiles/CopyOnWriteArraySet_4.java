import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_4 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        System.out.println(set.isEmpty()); // prints: true
        
        set.add("Hello");
        System.out.println(set.isEmpty()); // prints: false
    }
}
