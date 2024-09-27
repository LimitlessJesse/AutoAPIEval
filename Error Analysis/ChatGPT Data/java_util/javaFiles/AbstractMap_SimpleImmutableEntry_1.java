import java.util.AbstractMap.SimpleImmutableEntry;

public class AbstractMap_SimpleImmutableEntry_1 {
    public static void main(String[] args) {
        SimpleImmutableEntry<String, Integer> entry = new SimpleImmutableEntry<>("key", 10);
        String key = entry.getKey();
        System.out.println("Key: " + key);
    }
}
