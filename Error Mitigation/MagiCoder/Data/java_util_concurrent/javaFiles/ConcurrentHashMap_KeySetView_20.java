import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_20 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        ConcurrentHashMap.KeySetView<String, Integer> keySet = map.keySet();

        boolean isEqual = keySet.equals("One");
        System.out.println(isEqual);
    }
}
