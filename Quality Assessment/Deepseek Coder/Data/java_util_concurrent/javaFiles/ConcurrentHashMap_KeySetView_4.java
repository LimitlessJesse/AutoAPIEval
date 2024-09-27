import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_KeySetView_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        ConcurrentHashMap.KeySetView<String, String> keySet = map.keySet();

        boolean isRemoved = keySet.remove("1");
        System.out.println("Is the element removed? " + isRemoved);
        System.out.println("The map after removal: " + map);
    }
}
