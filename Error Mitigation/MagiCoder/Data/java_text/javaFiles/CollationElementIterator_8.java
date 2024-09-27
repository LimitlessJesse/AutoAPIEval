import java.text.Collator;
import java.text.CollationElementIterator;
import java.util.Locale;

public class CollationElementIterator_8 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.US);
        String str = "Hello";
        CollationElementIterator iterator = collator.getCollationElementIterator(str);

        if (iterator.next() == CollationElementIterator.WORD_BOUNDARY) {
            iterator.reset();
        }
    }
}
