import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, String> entry1 = new AbstractMap.SimpleEntry<>("key1", "value1");
        AbstractMap.SimpleEntry<String, String> entry2 = new AbstractMap.SimpleEntry<>("key1", "value1");

        boolean isEqual = entry1.equals(entry2);

        System.out.println("Are the entries equal? " + isEqual);
    }
}
