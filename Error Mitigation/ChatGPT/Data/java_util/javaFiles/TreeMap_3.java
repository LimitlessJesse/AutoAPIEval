import java.util.TreeMap;
import java.util.Map;

public class TreeMap_3 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(2);
        System.out.println("Floor Entry: " + floorEntry);
    }
}
