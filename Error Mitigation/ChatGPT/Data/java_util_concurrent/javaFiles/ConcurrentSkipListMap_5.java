import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_5 {
    public static void main(String[] args) {
        ConcurrentNavigableMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        ConcurrentNavigableMap<Integer, String> subMap = map.subMap(1, true, 3, false);
        
        System.out.println(subMap);
    }
}
