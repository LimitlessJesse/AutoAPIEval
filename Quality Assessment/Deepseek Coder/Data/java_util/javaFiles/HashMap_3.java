import java.util.HashMap;

public class HashMap_3 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean hasKey1 = map.containsKey("1");
        boolean hasKey3 = map.containsKey("3");

        System.out.println("Does the map contain the key '1'? " + hasKey1);
        System.out.println("Does the map contain the key '3'? " + hasKey3);
    }
}
