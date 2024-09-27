import java.util.IdentityHashMap;

public class IdentityHashMap_4 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        System.out.println("Map before removal: " + map);
        
        Integer removedValue = map.remove("One");
        
        System.out.println("Removed value: " + removedValue);
        System.out.println("Map after removal: " + map);
    }
}
