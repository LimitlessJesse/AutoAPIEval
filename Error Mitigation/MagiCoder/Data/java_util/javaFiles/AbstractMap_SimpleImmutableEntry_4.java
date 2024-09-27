import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry1 = new AbstractMap.SimpleImmutableEntry<>("Key1", 1);
        AbstractMap.SimpleImmutableEntry<String, Integer> entry2 = new AbstractMap.SimpleImmutableEntry<>("Key1", 1);
        AbstractMap.SimpleImmutableEntry<String, Integer> entry3 = new AbstractMap.SimpleImmutableEntry<>("Key2", 1);

        System.out.println(entry1.equals(entry2)); // true
        System.out.println(entry1.equals(entry3)); // false
    }
}
