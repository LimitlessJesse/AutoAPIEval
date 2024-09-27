import java.util.IdentityHashMap;

public class IdentityHashMap_3 {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        boolean containsKey1 = map.containsKey("key1");
        boolean containsKey4 = map.containsKey("key4");

        System.out.println("Contains key1: " + containsKey1);
        System.out.println("Contains key4: " + containsKey4);
    }
}
