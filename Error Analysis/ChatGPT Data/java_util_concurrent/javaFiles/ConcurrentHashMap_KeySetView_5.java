import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);

        ConcurrentHashMap.KeySetView<String, Integer> keySet = map.keySet();
        Object[] keyArray = keySet.toArray();
        
        for (Object key : keyArray) {
            System.out.println(key);
        }
    }
}
