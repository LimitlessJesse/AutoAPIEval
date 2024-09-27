import java.text.CollationElementIterator;
import java.text.RuleBasedCollator;
import java.text.ParseException;

public class CollationElementIterator_3 {
    public static void main(String[] args) {
        try {
            RuleBasedCollator collator = new RuleBasedCollator("< your collation rules >");
            CollationElementIterator iterator = collator.getCollationElementIterator("your international string");
            
            int ce = iterator.next();
            int maxExpansion = iterator.getMaxExpansion(ce);
            
            System.out.println("Max Expansion: " + maxExpansion);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
