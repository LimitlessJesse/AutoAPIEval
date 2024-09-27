import java.util.AbstractMap.SimpleEntry;

public class AbstractMap_SimpleEntry_1 {
    public static void main(String[] args) {
        SimpleEntry<String, Integer> entry = new SimpleEntry<>("Key", 10);
        System.out.println("Before: " + entry.getValue());
        
        entry.setValue(20);
        System.out.println("After: " + entry.getValue());
    }
}
