import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_1 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        ConcurrentNavigableMap<Integer, String> subMap = map.subMap(2, true, 4, false);
        System.out.println("Submap: " + subMap);
    }
}
