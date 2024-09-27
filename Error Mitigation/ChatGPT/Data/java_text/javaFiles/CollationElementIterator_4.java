import java.text.CollationElementIterator;

public class CollationElementIterator_4 {
    public static void main(String[] args) {
        CollationElementIterator iterator = new CollationElementIterator("example string");
        int offset = iterator.getOffset();
        System.out.println("Character offset: " + offset);
    }
}
