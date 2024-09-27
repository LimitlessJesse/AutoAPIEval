import java.util.HashMap;

public class HashMap_4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        
        System.out.println(map.containsKey("A")); // Output: true
        System.out.println(map.containsKey("C")); // Output: false
    }
}
