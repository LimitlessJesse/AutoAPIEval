import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_2 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        String value = map.get(2);
        System.out.println(value); // Output: Two
    }
}
