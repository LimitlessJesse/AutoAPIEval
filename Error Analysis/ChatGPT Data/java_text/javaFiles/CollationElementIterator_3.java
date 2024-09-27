import java.text.CollationElementIterator;
import java.text.RuleBasedCollator;

public class CollationElementIterator_3 {
    public static void main(String[] args) {
        RuleBasedCollator collator = (RuleBasedCollator) Collator.getInstance();
        collator.setStrength(Collator.IDENTICAL);
        CollationElementIterator iter = collator.getCollationElementIterator("text");

        int order = iter.next();
        System.out.println(order);
    }
}
