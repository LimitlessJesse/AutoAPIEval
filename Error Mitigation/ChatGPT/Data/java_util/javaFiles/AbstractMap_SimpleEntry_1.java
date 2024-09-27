import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_1 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry = new AbstractMap.SimpleEntry<>("key", 10);
        String key = entry.getKey();
        System.out.println("Key: " + key);
    }
}
