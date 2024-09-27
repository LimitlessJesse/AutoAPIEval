import java.util.HashMap;

public class HashMap_3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        System.out.println("Initial HashMap: " + map);
        
        Integer removedValue = map.remove("A");
        
        System.out.println("HashMap after removing key 'A': " + map);
        System.out.println("Value associated with key 'A' was: " + removedValue);
    }
}
