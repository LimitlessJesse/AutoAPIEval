import java.util.TreeMap;

public class TreeMap_3 {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        System.out.println("Original Map: " + map);

        map.remove("1");

        System.out.println("Map after removal: " + map);
    }
}
