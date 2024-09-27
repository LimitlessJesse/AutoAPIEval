import java.text.CollationElementIterator;

public class CollationElementIterator_1 {
    public static void main(String[] args) {
        CollationElementIterator iterator = new CollationElementIterator("international string");
        
        int nextCollationElement = iterator.next();
        System.out.println("Next collation element: " + nextCollationElement);
    }
}
