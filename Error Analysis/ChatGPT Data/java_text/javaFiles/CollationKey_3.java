import java.text.CollationKey;
import java.text.Collator;
import java.util.Locale;

public class CollationKey_3 {
    public static void main(String[] args) {
        // Create a Collator for the current locale
        Collator collator = Collator.getInstance(Locale.getDefault());
        
        // Get the CollationKey for a specific string
        CollationKey key = collator.getCollationKey("apple");
        
        // Get the source string from the CollationKey
        String sourceString = key.getSourceString();
        
        System.out.println("Source String: " + sourceString);
    }
}
