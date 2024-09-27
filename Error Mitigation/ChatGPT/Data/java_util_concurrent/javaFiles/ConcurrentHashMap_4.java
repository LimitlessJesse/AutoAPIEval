import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        System.out.println("Contains key 'One': " + map.containsKey("One"));
        System.out.println("Contains key 'Three': " + map.containsKey("Three"));
    }
}
