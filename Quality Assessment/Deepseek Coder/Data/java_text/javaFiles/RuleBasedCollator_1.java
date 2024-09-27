import java.text.RuleBasedCollator;
import java.util.Locale;
import java.text.Collator;

public class RuleBasedCollator_1 {
    public static void main(String[] args) {
        RuleBasedCollator collator = (RuleBasedCollator) Collator.getInstance(Locale.US);
        String s1 = "Hello";
        String s2 = "hello";
        int comparison = collator.compare(s1, s2);
        System.out.println(comparison);
    }
}
