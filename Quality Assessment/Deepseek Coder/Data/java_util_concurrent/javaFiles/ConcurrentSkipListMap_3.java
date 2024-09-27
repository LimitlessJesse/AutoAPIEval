import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_3 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        ConcurrentSkipListMap<Integer, String> tailMap = (ConcurrentSkipListMap<Integer, String>) map.tailMap(3, true);

        System.out.println("Tail Map: " + tailMap);
    }
}
