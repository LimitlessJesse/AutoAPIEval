import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("key", 123);
        int hashCode = entry.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
