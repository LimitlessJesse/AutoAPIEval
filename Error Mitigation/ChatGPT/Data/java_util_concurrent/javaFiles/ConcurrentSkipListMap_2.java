import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMap_2 {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println("Map before removal: " + map);

        String removedValue = map.remove(1);

        System.out.println("Removed value: " + removedValue);
        System.out.println("Map after removal: " + map);
    }
}
