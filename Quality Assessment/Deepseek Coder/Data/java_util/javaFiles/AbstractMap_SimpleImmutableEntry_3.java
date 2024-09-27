import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_3 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, String> entry = new AbstractMap.SimpleImmutableEntry<>("key", "value");
        int hashCode = entry.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
