import java.util.IdentityHashMap;

public class IdentityHashMap_11 {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String key1 = "key1";
        String key2 = "key2";
        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println("Hash code of key1: " + System.identityHashCode(key1));
        System.out.println("Hash code of key2: " + System.identityHashCode(key2));
        System.out.println("Hash code of map: " + map.hashCode());
    }
}
