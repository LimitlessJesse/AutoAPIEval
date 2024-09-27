import java.util.TreeMap;

public class TreeMap_4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println("Original TreeMap: " + treeMap);

        // Removing a key-value pair from the TreeMap
        Integer removedValue = treeMap.remove("Two");

        System.out.println("Removed Value: " + removedValue);
        System.out.println("Updated TreeMap: " + treeMap);
    }
}
