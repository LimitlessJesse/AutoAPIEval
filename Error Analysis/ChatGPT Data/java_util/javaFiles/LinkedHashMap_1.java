import java.util.LinkedHashMap;

public class LinkedHashMap_1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        int value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);
    }
}
