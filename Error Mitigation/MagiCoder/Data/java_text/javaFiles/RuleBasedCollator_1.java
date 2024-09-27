import java.text.RuleBasedCollator;
import java.util.Locale;

public class RuleBasedCollator_1 {
    public static void main(String[] args) {
        RuleBasedCollator collator = (RuleBasedCollator) Collator.getInstance(new Locale("en", "US"));
        String source = "Hello";
        String target = "World";
        int result = collator.compare(source, target);
        System.out.println(result);
    }
}
