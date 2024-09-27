import java.util.AbstractMap;
import java.util.Map;

public class AbstractMap_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new AbstractMap<String, Integer>() {
            @Override
            public int hashCode() {
                int hash = 0;
                for (Map.Entry<String, Integer> entry : entrySet()) {
                    hash += entry.hashCode();
                }
                return hash;
            }
        };

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println(map.hashCode());
    }
}
