import java.util.WeakHashMap;

public class WeakHashMap_4 {
    public static void main(String[] args) {
        WeakHashMap<String, String> weakMap = new WeakHashMap<>();
        weakMap.put("key1", "value1");
        weakMap.put("key2", "value2");

        boolean containsKey1 = weakMap.containsKey("key1");
        System.out.println("Contains key1: " + containsKey1);

        boolean containsKey3 = weakMap.containsKey("key3");
        System.out.println("Contains key3: " + containsKey3);
    }
}
