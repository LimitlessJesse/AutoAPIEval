import java.util.AbstractMap;

public class AbstractMap_4 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new AbstractMap<String, Integer>() {
            @Override
            public Integer put(String key, Integer value) {
                // Custom implementation goes here
                return super.put(key, value);
            }
        };

        map.put("key1", 1);
        map.put("key2", 2);

        System.out.println(map);
    }
}
