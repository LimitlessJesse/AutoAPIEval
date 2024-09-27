import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        String value = map.get("1");
        System.out.println(value);  // Output: Hello
    }
}
