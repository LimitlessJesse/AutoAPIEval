import javax.swing.text.ElementIterator;
import javax.swing.text.Element;

public class ElementIterator_1 {
    public static void main(String[] args) {
        // Create an ElementIterator to iterate through elements
        ElementIterator iterator = new ElementIterator(rootElement);

        // Iterate through elements using next()
        Element element;
        while ((element = iterator.next()) != null) {
            // Do something with the element
            System.out.println("Element name: " + element.getName());
        }
    }
}
