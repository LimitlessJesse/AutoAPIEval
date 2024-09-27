import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_2 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("Key", 10);
        String key = entry.getKey();
        System.out.println("Key: " + key);
    }
}
