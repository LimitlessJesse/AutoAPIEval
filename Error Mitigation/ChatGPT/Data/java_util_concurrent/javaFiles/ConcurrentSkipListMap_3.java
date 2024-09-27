import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_3 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println("Initial map: " + map);
        
        String replacedValue = map.replace(2, "New Two");
        
        System.out.println("Replaced value: " + replacedValue);
        System.out.println("Updated map: " + map);
    }
}
