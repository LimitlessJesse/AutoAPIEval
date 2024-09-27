import java.text.RuleBasedCollator;
import java.text.ParseException;

public class RuleBasedCollator_3 {
    public static void main(String[] args) {
        try {
            RuleBasedCollator collator = (RuleBasedCollator) Collator.getInstance(java.util.Locale.US);
            collator.setRules("[à=a, á=a, ã=a]");
            System.out.println(collator.getRules());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
