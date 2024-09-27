import java.util.HashMap;

public class HashMap_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        boolean containsKey = map.containsKey("One");
        System.out.println("Key 'One' exists in the map: " + containsKey);
    }
}
