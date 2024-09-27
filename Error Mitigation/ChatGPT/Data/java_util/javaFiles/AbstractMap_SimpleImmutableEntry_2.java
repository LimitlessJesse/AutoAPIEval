import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_2 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("key", 10);
        System.out.println("Value: " + entry.getValue());
    }
}
