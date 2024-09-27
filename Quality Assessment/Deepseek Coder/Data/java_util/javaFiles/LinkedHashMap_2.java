import java.util.LinkedHashMap;

public class LinkedHashMap_2 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        String value = map.get("1");
        System.out.println(value);  // Output: Hello
    }
}
