import java.text.Collator;
import java.text.CollationElementIterator;
import java.text.RuleBasedCollator;

public class CollationElementIterator_9 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        CollationElementIterator iterator = collator.getCollationElementIterator("Hello");
        while (iterator.next()!= CollationElementIterator.DONE) {
            System.out.println(iterator.getRuleStatus());
        }
    }
}
