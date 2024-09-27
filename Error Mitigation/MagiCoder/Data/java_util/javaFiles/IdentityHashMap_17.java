import java.util.IdentityHashMap;
import java.util.Set;

public class IdentityHashMap_17 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
