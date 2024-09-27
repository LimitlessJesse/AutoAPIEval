import java.text.CollationElementIterator;
import java.text.RuleBasedCollator;
import java.text.ParseException;

public class CollationElementIterator_1 {
    public static void main(String[] args) {
        RuleBasedCollator myCollator = null;
        try {
            myCollator = new RuleBasedCollator("< a < b < c");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        CollationElementIterator myIterator = myCollator.getCollationElementIterator("abc");
        int expansion = myIterator.getMaxExpansion(0); // Getting the maximum length of any expansion sequence starting with the specified collation element.
        System.out.println("Maximum expansion for the first collation element: " + expansion);
    }
}
