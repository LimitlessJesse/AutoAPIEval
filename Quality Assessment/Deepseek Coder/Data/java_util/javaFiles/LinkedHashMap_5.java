import java.util.LinkedHashMap;

public class LinkedHashMap_5 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean containsValue = map.containsValue("Hello");
        System.out.println("Does the map contain the value 'Hello'? " + containsValue);
    }
}
