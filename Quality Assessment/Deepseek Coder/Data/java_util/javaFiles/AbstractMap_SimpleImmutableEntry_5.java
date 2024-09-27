import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, String> entry = new AbstractMap.SimpleImmutableEntry<>("key", "value");
        System.out.println(entry.toString());
    }
}
