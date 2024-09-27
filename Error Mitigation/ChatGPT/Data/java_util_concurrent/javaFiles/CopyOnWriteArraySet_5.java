import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_5 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        System.out.println("Set before clear: " + set);
        
        set.clear();
        System.out.println("Set after clear: " + set);
    }
}
