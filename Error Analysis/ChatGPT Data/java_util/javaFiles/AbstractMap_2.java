import java.util.AbstractMap;
import java.util.Map;

public class AbstractMap_2 {
    public static void main(String[] args) {
        Map.Entry<String, Integer> entry1 = new AbstractMap.SimpleEntry<>("A", 1);
        Map.Entry<String, Integer> entry2 = new AbstractMap.SimpleEntry<>("B", 2);

        boolean isEqual = entry1.equals(entry2);
        System.out.println("Are the entries equal? " + isEqual);
    }
}
