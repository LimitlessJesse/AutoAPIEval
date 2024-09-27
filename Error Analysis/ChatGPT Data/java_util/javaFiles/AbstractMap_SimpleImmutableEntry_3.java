import java.util.AbstractMap;
import java.util.Map;

public class AbstractMap_SimpleImmutableEntry_3 {
    public static void main(String[] args) {
        Map.Entry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("key", 10);
        System.out.println("Before: " + entry);

        entry = entry.setValue(20);
        System.out.println("After: " + entry);
    }
}
