import javax.swing.text.ElementIterator;
import javax.swing.text.Element;

public class ElementIterator_4 {
    public static void main(String[] args) {
        ElementIterator elementIterator = new ElementIterator();
        int currentDepth = elementIterator.depth();
        System.out.println("Current depth of element tree: " + currentDepth);
    }
}
