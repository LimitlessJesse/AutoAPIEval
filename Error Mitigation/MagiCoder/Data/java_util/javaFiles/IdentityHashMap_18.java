import java.util.Collection;
import java.util.IdentityHashMap;

public class IdentityHashMap_18 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
