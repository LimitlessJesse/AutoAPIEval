import java.util.AbstractMap;
import java.util.HashMap;

public class AbstractMap_5 {
    public static void main(String[] args) {
        AbstractMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean containsValue = map.containsValue("Hello");
        System.out.println(containsValue);  // Output: true

        containsValue = map.containsValue("Java");
        System.out.println(containsValue);  // Output: false
    }
}
