import java.util.LinkedHashMap;

public class LinkedHashMap_4 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Map before clear: " + map);

        map.clear();
        System.out.println("Map after clear: " + map);
    }
}
