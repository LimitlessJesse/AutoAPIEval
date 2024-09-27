import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_2 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        set.add("World");
        
        System.out.println("Set before removal: " + set);
        
        boolean removed = set.remove("Hello");
        
        System.out.println("Element 'Hello' removed: " + removed);
        System.out.println("Set after removal: " + set);
    }
}
