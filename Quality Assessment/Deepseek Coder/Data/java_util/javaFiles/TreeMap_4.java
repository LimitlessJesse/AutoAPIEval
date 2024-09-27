import java.util.TreeMap;

public class TreeMap_4 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean containsKey = map.containsKey("1");
        System.out.println(containsKey);  // Output: true

        containsKey = map.containsKey("3");
        System.out.println(containsKey);  // Output: false
    }
}
