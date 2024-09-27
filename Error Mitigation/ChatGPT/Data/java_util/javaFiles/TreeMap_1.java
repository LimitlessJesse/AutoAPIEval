import java.util.TreeMap;
import java.util.Map;

public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        Map.Entry<Integer, String> entry = treeMap.ceilingEntry(2);
        System.out.println("Ceiling Entry for key 2: " + entry.getKey() + " - " + entry.getValue());
    }
}
