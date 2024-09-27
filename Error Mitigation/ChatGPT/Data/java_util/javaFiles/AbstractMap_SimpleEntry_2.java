import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_2 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry = new AbstractMap.SimpleEntry<>("key", 10);
        System.out.println("Value: " + entry.getValue());
    }
}
