import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_4 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Integer firstKey = map.firstKey();
        System.out.println("First Key: " + firstKey);
    }
}
