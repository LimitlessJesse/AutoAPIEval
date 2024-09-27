import java.util.AbstractMap;

public class AbstractMap_SimpleImmutableEntry_5 {
    public static void main(String[] args) {
        AbstractMap.SimpleImmutableEntry<String, Integer> entry1 = new AbstractMap.SimpleImmutableEntry<>("Key", 10);
        AbstractMap.SimpleImmutableEntry<String, Integer> entry2 = new AbstractMap.SimpleImmutableEntry<>("Key", 10);
        
        boolean isEqual = entry1.equals(entry2);
        System.out.println("Are the entries equal? " + isEqual);
    }
}
