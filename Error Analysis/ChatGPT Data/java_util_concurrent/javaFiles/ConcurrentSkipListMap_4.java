import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_4 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        
        NavigableMap<Integer, String> subMap = map.subMap(2, true, 4, true);
        
        System.out.println(subMap); // Output: {2=Two, 3=Three, 4=Four}
    }
}
