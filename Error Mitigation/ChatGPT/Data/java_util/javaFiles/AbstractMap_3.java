import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public class AbstractMap_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new AbstractMap<String, Integer>() {
            @Override
            public Set<String> keySet() {
                return super.keySet();
            }
        };

        map.put("One", 1);
        map.put("Two", 2);

        Set<String> keySet = map.keySet();
        System.out.println("Keys in the map: " + keySet);
    }
}
