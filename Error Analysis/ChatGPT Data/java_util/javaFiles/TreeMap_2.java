import java.util.TreeMap;

public class TreeMap_2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        System.out.println("Before removal: " + treeMap);

        // Using remove() method to remove key 2
        treeMap.remove(2);
        System.out.println("After removal: " + treeMap);
    }
}
