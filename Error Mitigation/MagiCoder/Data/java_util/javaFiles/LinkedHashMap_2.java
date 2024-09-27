import java.util.LinkedHashMap;

public class LinkedHashMap_2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        System.out.println(map.containsValue("value2")); // Output: true
        System.out.println(map.containsValue("value4")); // Output: false
    }
}
