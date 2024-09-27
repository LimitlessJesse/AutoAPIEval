import java.text.Collator;
import java.text.CollationElementIterator;
import java.text.ParseException;

public class CollationElementIterator_6 {
    public static void main(String[] args) throws ParseException {
        Collator collator = Collator.getInstance();
        String text = "Hello";
        CollationElementIterator iterator = collator.getCollationElementIterator(text);
        iterator.setOffset(2);
        System.out.println(iterator.next());
    }
}
