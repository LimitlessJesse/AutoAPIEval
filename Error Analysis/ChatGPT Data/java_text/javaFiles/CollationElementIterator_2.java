import java.text.CollationElementIterator;
import java.text.RuleBasedCollator;
import java.text.ParseException;

public class CollationElementIterator_2 {
    public static void main(String[] args) {
        try {
            RuleBasedCollator collator = new RuleBasedCollator("< your customized collator rules >");
            CollationElementIterator iterator = collator.getCollationElementIterator("stringToIterate");
            
            while(iterator.next() != CollationElementIterator.NULLORDER) {
                int offset = iterator.getOffset();
                System.out.println("Offset: " + offset);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
