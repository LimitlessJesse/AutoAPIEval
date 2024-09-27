import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

public class ConcurrentHashMap_4 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        BiFunction<String, Integer, Integer> remappingFunction = (key, oldValue) -> oldValue + 1;

        Integer result = map.compute("one", remappingFunction);
        System.out.println("Result: " + result);

        System.out.println("Map: " + map);
    }
}
