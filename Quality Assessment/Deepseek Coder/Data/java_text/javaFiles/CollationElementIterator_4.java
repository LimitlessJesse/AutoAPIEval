import java.text.CollationElementIterator;
import java.text.Collator;
import java.util.Locale;

public class CollationElementIterator_4 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.US);
        CollationElementIterator iterator = collator.getCollationElementIterator("abc");

        if (iterator!= null && iterator.next() == CollationElementIterator.CE_STRING) {
            System.out.println(iterator.getLocaleString());
        }

        if (iterator!= null && iterator.previous() == CollationElementIterator.CE_STRING) {
            System.out.println(iterator.getLocaleString());
        }
    }
}
