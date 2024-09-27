import java.text.CollationElementIterator;

public class CollationElementIterator_5 {
    public static void main(String[] args) {
        int order = 123; // example collation element
        int primaryComponent = CollationElementIterator.primaryOrder(order);
        System.out.println("Primary component: " + primaryComponent);
    }
}
