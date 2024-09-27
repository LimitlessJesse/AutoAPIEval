import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("key", 10);
        System.out.println(entry.toString());
    }
}
