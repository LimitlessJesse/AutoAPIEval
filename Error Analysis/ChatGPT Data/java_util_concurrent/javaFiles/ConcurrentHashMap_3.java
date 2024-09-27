import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        String keyToCheck = "Two";
        System.out.println("Does map contain key '" + keyToCheck + "': " + map.containsKey(keyToCheck));
    }
}
