import java.util.AbstractMap;

public class AbstractMap_3 {
    public static void main(String[] args) {
        AbstractMap<String, Integer> map = new AbstractMap<String, Integer>() {
            @Override
            public int hashCode() {
                // Your custom implementation for generating the hash code
                // This method should return a unique hash code for each key-value pair in the map
                return super.hashCode();
            }
        };
        map.put("key1", 1);
        map.put("key2", 2);
        System.out.println("Hash code of the map: " + map.hashCode());
    }
}
