import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_3 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry = new AbstractMap.SimpleEntry<>("key", 10);
        System.out.println("Old value: " + entry.setValue(20));
        System.out.println("New value: " + entry.getValue());
    }
}
