import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        // get value for key1
        String value1 = map.get("key1");
        System.out.println("Value for key1: " + value1);

        // get value for key2
        String value2 = map.get("key2");
        System.out.println("Value for key2: " + value2);

        // get value for non-existing key
        String value3 = map.get("key3");
        System.out.println("Value for key3: " + value3);
    }
}
