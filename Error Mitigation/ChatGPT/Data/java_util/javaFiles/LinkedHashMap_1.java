import java.util.LinkedHashMap;

public class LinkedHashMap_1 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        
        System.out.println("Value for key 'One': " + map.get("One"));
        System.out.println("Value for key 'Three': " + map.get("Three"));
    }
}
