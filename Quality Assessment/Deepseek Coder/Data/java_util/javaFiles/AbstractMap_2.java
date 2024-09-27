import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class AbstractMap_2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("1", "One");
        map1.put("2", "Two");

        Map<String, String> map2 = new HashMap<>();
        map2.put("3", "Three");
        map2.put("4", "Four");

        AbstractMap<String, String> abstractMap = new AbstractMap<String, String>() {
            @Override
            public Set<Entry<String, String>> entrySet() {
                // TODO Auto-generated method stub
                return null;
            }
        };

        abstractMap.putAll(map1);
        abstractMap.putAll(map2);

        System.out.println(abstractMap);
    }
}
