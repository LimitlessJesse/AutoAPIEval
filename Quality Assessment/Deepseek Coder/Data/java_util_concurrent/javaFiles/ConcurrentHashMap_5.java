import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

public class ConcurrentHashMap_5 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);

        BiFunction<String, Integer, Integer> remappingFunction = (key, oldValue) -> oldValue + 1;

        Integer result = map.merge("one", 2, remappingFunction);

        System.out.println(result);  // Output: 3
    }
}
