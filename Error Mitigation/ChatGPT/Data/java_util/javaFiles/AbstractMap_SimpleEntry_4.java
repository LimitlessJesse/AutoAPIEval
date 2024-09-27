import java.util.AbstractMap;

public class AbstractMap_SimpleEntry_4 {
    public static void main(String[] args) {
        AbstractMap.SimpleEntry<String, Integer> entry1 = new AbstractMap.SimpleEntry<>("key1", 1);
        AbstractMap.SimpleEntry<String, Integer> entry2 = new AbstractMap.SimpleEntry<>("key1", 1);
        
        System.out.println("Entry 1: " + entry1);
        System.out.println("Entry 2: " + entry2);
        
        System.out.println("Are entries equal? " + entry1.equals(entry2));
    }
}
