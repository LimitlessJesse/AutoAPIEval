import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        
        SortedMap<Integer, String> headMap = treeMap.headMap(3);
        
        System.out.println("Head Map: " + headMap);
    }
}
