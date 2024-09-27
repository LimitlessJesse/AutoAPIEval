import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.Collection;
import java.util.Arrays;

public class ConcurrentHashMap_KeySetView_10 {
    public static void main(String[] args) {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        KeySetView<String, Integer> keySet = map.keySet();

        // Remove all keys from the map
        boolean result = keySet.removeAll(Arrays.asList("A", "B"));
        System.out.println("Removal result: " + result);

        // Print the remaining keys
        for (String key : keySet) {
            System.out.println("Key: " + key);
        }
    }
}
