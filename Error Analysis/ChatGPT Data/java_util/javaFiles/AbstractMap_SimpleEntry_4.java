import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry = new AbstractMap.SimpleEntry<>("Key", 123);
        System.out.println(entry.toString());
    }
}
