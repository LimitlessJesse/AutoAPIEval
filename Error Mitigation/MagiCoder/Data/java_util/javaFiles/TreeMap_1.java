import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println(treeMap.containsKey("One")); // Outputs: true
        System.out.println(treeMap.containsKey("Four")); // Outputs: false
    }
}
