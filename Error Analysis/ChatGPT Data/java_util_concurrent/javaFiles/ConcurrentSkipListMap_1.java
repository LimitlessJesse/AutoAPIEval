import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_1 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        System.out.println(map);
    }
}
