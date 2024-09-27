import java.util.TreeMap;

public class TreeMap_5 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean containsValue = map.containsValue("Hello");
        System.out.println(containsValue);  // Output: true

        containsValue = map.containsValue("Java");
        System.out.println(containsValue);  // Output: false
    }
}
