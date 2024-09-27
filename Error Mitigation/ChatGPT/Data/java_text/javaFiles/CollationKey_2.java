import java.text.CollationKey;
import java.text.Collator;

public class CollationKey_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        CollationKey key = collator.getCollationKey("apple");
        String sourceString = key.getSourceString();
        System.out.println("Source String: " + sourceString);
    }
}
