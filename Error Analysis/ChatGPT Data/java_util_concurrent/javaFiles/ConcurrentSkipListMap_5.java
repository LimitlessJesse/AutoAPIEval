import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_5 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        NavigableSet<Integer> navigableKeySet = map.navigableKeySet();
        
        System.out.println("Navigable Key Set: " + navigableKeySet);
    }
}
