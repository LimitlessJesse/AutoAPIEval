import java.text.RuleBasedCollator;

public class RuleBasedCollator_4 {
    public static void main(String[] args) {
        RuleBasedCollator collator = (RuleBasedCollator) RuleBasedCollator.getInstance();
        String rules = collator.getRules();
        System.out.println("Collation rules: " + rules);
    }
}
