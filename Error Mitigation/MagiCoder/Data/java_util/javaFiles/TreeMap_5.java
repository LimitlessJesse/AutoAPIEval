import java.util.TreeMap;

public class TreeMap_5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        System.out.println("Before replace: " + treeMap);

        Integer replacedValue = treeMap.replace("Two", 20);

        System.out.println("After replace: " + treeMap);
        System.out.println("Replaced value: " + replacedValue);
    }
}
