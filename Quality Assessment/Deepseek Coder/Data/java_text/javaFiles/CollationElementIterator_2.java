import java.text.CollationElementIterator;
import java.text.Collator;
import java.util.Locale;

public class CollationElementIterator_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.US);
        String str = "abc";
        CollationElementIterator iterator = collator.getCollationElementIterator(str);

        while (iterator.next()!= CollationElementIterator.DONE) {
            int offset = iterator.getOffset();
            System.out.println("Offset: " + offset);
        }
    }
}
