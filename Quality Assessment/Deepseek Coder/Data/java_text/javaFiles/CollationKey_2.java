import java.text.Collator;
import java.text.CollationKey;
import java.util.Locale;

public class CollationKey_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.US);
        String str1 = "Hello";
        String str2 = "World";
        CollationKey key1 = collator.getCollationKey(str1);
        CollationKey key2 = collator.getCollationKey(str2);
        int result = key1.compareTo(key2);
        System.out.println(result);
    }
}
