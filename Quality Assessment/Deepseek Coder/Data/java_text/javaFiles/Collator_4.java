import java.text.Collator;
import java.util.Locale;

public class Collator_4 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("en", "US"));
        collator.setDecomposition(Collator.FULL_DECOMPOSITION);

        String str1 = "résumé";
        String str2 = "rés�me";

        int comparison = collator.compare(str1, str2);

        if (comparison == 0) {
            System.out.println("The strings are equal.");
        } else if (comparison < 0) {
            System.out.println("The first string is less than the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
    }
}
