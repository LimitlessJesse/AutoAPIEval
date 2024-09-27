import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_4 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        
        System.out.println("Initial set: " + set);
        
        String firstElement = set.pollFirst();
        
        System.out.println("Removed first element: " + firstElement);
        System.out.println("Set after removing first element: " + set);
    }
}
