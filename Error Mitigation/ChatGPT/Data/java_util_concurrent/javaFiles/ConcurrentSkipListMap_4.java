import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_4 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        String value = map.getOrDefault(1, "Default");
        System.out.println(value); // Output: One
        
        String value2 = map.getOrDefault(3, "Default");
        System.out.println(value2); // Output: Default
    }
}
