import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(16, 0.75f, true) {
            private static final int MAX_ENTRIES = 100;

            @Override
            protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                return size() > MAX_ENTRIES;
            }
        };

        // Adding elements to the LinkedHashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Printing the LinkedHashMap
        System.out.println(map);

        // Adding more elements to trigger removeEldestEntry
        for (int i = 4; i <= 110; i++) {
            map.put("Key" + i, i);
        }

        // Printing the LinkedHashMap after adding more elements
        System.out.println(map);
    }
}
