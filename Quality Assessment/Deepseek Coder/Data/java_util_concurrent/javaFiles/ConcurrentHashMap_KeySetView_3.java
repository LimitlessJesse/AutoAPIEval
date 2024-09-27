import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_3 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        ConcurrentHashMap.KeySetView<String, String> keySet = map.keySet();

        boolean containsKey1 = keySet.contains("1");
        System.out.println("Contains key '1': " + containsKey1);

        boolean containsKey3 = keySet.contains("3");
        System.out.println("Contains key '3': " + containsKey3);
    }
}
