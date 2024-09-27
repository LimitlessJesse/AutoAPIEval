import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_2 {
    public static void main(String[] args) {
        ConcurrentNavigableMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        System.out.println("Original Map: " + map);

        ConcurrentNavigableMap<Integer, String> headMap = map.headMap(3, true);
        System.out.println("Head Map: " + headMap);
    }
}
