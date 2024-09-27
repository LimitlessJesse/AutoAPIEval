import java.util.TreeMap;

public class TreeMap_4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");

        Integer key = 2;
        Integer floorKey = treeMap.floorKey(key);

        System.out.println("Floor key for " + key + " is: " + floorKey);
    }
}
