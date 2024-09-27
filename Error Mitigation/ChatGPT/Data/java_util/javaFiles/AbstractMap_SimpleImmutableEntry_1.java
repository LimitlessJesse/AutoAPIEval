import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_1 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("key", 10);
        String key = entry.getKey();
        System.out.println("Key: " + key);
    }
}
