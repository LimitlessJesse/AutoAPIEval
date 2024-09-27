import java.text.CollationElementIterator;

public class CollationElementIterator_2 {
    public static void main(String[] args) {
        CollationElementIterator iterator = new CollationElementIterator("international string");
        
        // Move to the last collation element
        int lastElement = iterator.previous();
        System.out.println("Last collation element: " + lastElement);
        
        // Move to the previous collation element
        int previousElement = iterator.previous();
        System.out.println("Previous collation element: " + previousElement);
    }
}
