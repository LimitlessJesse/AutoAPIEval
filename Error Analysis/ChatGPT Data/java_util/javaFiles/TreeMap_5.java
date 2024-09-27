import java.util.TreeMap;

public class TreeMap_5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // Check if the TreeMap contains a key
        boolean containsKey = map.containsKey(1);
        System.out.println("Map contains key 1: " + containsKey);
    }
}
