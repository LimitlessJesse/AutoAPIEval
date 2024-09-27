import java.text.CollationKey;
import java.text.Collator;

public class CollationKey_1 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        CollationKey key1 = collator.getCollationKey("apple");
        CollationKey key2 = collator.getCollationKey("banana");

        int result = key1.compareTo(key2);
        System.out.println("Comparison result: " + result);
    }
}
