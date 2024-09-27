import java.text.RuleBasedCollator;

public class RuleBasedCollator_5 {
    public static void main(String[] args) {
        RuleBasedCollator collator = (RuleBasedCollator) RuleBasedCollator.getInstance();
        String rules = collator.getRules();
        System.out.println("Collator Rules: " + rules);
    }
}
