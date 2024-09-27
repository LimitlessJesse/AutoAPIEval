import java.util.AbstractMap;
import java.util.HashMap;

public class AbstractMap_4 {
    public static void main(String[] args) {
        AbstractMap<String, String> map = new HashMap<>();
        map.put("1", "Hello");
        map.put("2", "World");

        boolean containsKey1 = map.containsKey("1");
        boolean containsKey2 = map.containsKey("3");

        System.out.println("Contains key '1': " + containsKey1);
        System.out.println("Contains key '3': " + containsKey2);
    }
}
