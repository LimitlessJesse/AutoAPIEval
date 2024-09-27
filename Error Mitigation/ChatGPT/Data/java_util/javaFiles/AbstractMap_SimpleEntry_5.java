import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry = new AbstractMap.SimpleEntry<>("key", 10);
        int hashCode = entry.hashCode();
        System.out.println("Hash code value for the map entry: " + hashCode);
    }
}
