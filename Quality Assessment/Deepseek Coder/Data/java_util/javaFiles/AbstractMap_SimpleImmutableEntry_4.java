import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, String> entry1 = new AbstractMap.SimpleImmutableEntry<>("key", "value");
        AbstractMap.SimpleImmutableEntry<String, String> entry2 = new AbstractMap.SimpleImmutableEntry<>("key", "value");

        boolean isEqual = entry1.equals(entry2);

        System.out.println("Are the entries equal? " + isEqual);
    }
}
