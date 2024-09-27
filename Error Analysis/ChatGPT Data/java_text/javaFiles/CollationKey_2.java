import java.text.Collator;
import java.text.CollationKey;

public class CollationKey_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        
        CollationKey key1 = collator.getCollationKey("apple");
        CollationKey key2 = collator.getCollationKey("banana");
        
        int comparison = key1.compareTo(key2);
        if (comparison < 0) {
            System.out.println("apple comes before banana");
        } else if (comparison > 0) {
            System.out.println("apple comes after banana");
        } else {
            System.out.println("apple and banana are equal");
        }
    }
}
