import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_4 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");

        Set<Integer> keySet = linkedHashMap.keySet();

        System.out.println(keySet);
    }
}
