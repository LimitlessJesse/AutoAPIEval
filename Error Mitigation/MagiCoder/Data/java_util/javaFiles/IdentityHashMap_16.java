import java.util.IdentityHashMap;
import java.util.function.BiConsumer;

public class IdentityHashMap_16 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println("Key: " + key + ", Value: " + value);
            }
        });
    }
}
