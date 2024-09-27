import java.util.LinkedHashMap;

public class LinkedHashMap_3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // get value for key1
        String value = map.get("key1");
        System.out.println(value);  // prints: value1

        // get value for key3 (which is not in the map)
        value = map.get("key3");
        System.out.println(value);  // prints: null
    }
}
