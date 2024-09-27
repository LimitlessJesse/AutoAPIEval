import java.util.LinkedHashMap;
import java.util.Collection;

public class LinkedHashMap_5 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        
        Collection<String> values = linkedHashMap.values();
        System.out.println("Values in LinkedHashMap: " + values);
    }
}
