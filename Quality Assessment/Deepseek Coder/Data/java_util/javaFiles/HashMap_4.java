import java.util.HashMap;

public class HashMap_4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean isValuePresent = map.containsValue("Hello");
        System.out.println("Is 'Hello' present in the map? " + isValuePresent);

        isValuePresent = map.containsValue("Java");
        System.out.println("Is 'Java' present in the map? " + isValuePresent);
    }
}
