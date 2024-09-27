import java.util.HashMap;

public class HashMap_5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        System.out.println("Before removal: " + map);
        
        Integer removedValue = map.remove("One");
        
        System.out.println("Removed value: " + removedValue);
        System.out.println("After removal: " + map);
    }
}
