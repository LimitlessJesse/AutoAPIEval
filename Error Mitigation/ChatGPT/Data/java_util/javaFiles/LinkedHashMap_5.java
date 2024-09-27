import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_5 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        Set<String> keySet = map.keySet();
        
        System.out.println("Keys in the map:");
        for(String key : keySet) {
            System.out.println(key);
        }
    }
}
