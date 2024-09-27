import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_2 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<Integer, String> entry1 = new AbstractMap.SimpleEntry<>(1, "One");
        AbstractMap.SimpleEntry<Integer, String> entry2 = new AbstractMap.SimpleEntry<>(1, "One");
        
        System.out.println(entry1.equals(entry2)); // Output: true
    }
}
