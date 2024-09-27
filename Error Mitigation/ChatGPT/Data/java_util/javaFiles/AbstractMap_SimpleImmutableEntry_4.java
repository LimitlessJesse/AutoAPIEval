import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry = new AbstractMap.SimpleImmutableEntry<>("key", 10);
        int hashCode = entry.hashCode();
        System.out.println("Hash code value for the map entry: " + hashCode);
    }
}
