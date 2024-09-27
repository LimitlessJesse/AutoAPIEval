import java.util.HashMap;

public class HashMap_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Before removal: " + map);

        // Removing a key-value pair
        map.remove("Two");

        System.out.println("After removal: " + map);
    }
}
