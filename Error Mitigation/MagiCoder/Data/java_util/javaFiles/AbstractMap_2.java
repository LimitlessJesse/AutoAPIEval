import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class AbstractMap_2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("A", 1);
        map2.put("B", 2);

        System.out.println(map1.equals(map2)); // true

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("A", 1);
        map3.put("B", 3);

        System.out.println(map1.equals(map3)); // false
    }
}
