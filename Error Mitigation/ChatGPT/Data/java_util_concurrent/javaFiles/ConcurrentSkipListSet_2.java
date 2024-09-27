import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_2 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Hello");
        set.add("World");
        
        System.out.println("Set before removal: " + set);
        
        boolean removed = set.remove("Hello");
        
        System.out.println("Element 'Hello' removed: " + removed);
        System.out.println("Set after removal: " + set);
    }
}
