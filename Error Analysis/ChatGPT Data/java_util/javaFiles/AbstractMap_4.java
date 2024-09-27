import java.util.AbstractMap;
import java.util.Set;

public class AbstractMap_4 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new AbstractMap<String, Integer>() {
            @Override
            public Set<Entry<String, Integer>> entrySet() {
                return null;
            }
        };

        map.put("One", 1);
        map.put("Two", 2);

        Set<String> keySet = map.keySet();
        System.out.println("Key Set: " + keySet);
    }
}
