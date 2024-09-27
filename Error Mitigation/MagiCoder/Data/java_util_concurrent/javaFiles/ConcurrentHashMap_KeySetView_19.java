import java.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

public class ConcurrentHashMap_KeySetView_19 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        ConcurrentHashMap.KeySetView<String, Integer> keySetView = map.keySet();

        boolean result = keySetView.containsAll(Arrays.asList("One", "Two"));
        System.out.println(result);  // Output: true

        result = keySetView.containsAll(Arrays.asList("One", "Two", "Four"));
        System.out.println(result);  // Output: false
    }
}
