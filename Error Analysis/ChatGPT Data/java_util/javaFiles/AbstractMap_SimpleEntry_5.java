import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<Integer, String> entry = new AbstractMap.SimpleEntry<>(1, "One");
        Integer key = entry.getKey();
        System.out.println("Key: " + key);
    }
}
