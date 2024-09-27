import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_3 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry1 = new AbstractMap.SimpleImmutableEntry<>("key", 1);
        AbstractMap.SimpleImmutableEntry<String, Integer> entry2 = new AbstractMap.SimpleImmutableEntry<>("key", 1);

        System.out.println(entry1.equals(entry2)); // Output: true
    }
}
