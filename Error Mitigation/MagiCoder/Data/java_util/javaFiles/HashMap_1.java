import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        boolean containsKey = map.containsKey("One");
        System.out.println(containsKey); // Output: true

        containsKey = map.containsKey("Four");
        System.out.println(containsKey); // Output: false
    }
}
