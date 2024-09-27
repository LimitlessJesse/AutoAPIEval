import java.text.Collator;
import java.text.ParseException;
import java.util.Locale;

public class CollationKey_2 {
    public static void main(String[] args) throws ParseException {
        Collator collator = Collator.getInstance(Locale.US);
        String str1 = "Hello";
        String str2 = "World";

        java.text.CollationKey key1 = collator.getCollationKey(str1);
        java.text.CollationKey key2 = collator.getCollationKey(str2);

        int result = key1.compareTo(key2);

        if (result < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else if (result == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println(str1 + " is greater than " + str2);
        }
    }
}
