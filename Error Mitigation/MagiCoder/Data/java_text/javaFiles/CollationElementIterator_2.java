import java.text.Collator;
import java.text.CollationElementIterator;
import java.text.ParseException;

public class CollationElementIterator_2 {
    public static void main(String[] args) throws ParseException {
        Collator collator = Collator.getInstance();
        String text = "Hello";
        CollationElementIterator iterator = collator.getCollationElementIterator(text);

        if (iterator.hasNext()) {
            int offset = iterator.getOffset();
            System.out.println("Offset: " + offset);
        }
    }
}
