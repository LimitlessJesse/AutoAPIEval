import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_3 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<Integer, String> entry = new AbstractMap.SimpleEntry<>(1, "One");
        System.out.println(entry.hashCode());
    }
}
