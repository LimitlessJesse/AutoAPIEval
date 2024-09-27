import java.text.CollationElementIterator;
import java.text.Collator;
import java.util.Locale;

public class CollationElementIterator_3 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.US);
        CollationElementIterator iterator = collator.getCollationElementIterator("abc");

        while (iterator.next()!= Collator.DONE) {
            System.out.println(iterator.getLocaleKey());
        }
    }
}
