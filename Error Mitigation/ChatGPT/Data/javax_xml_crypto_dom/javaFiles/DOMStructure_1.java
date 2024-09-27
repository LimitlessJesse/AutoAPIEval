import javax.xml.crypto.dom.DOMStructure;
import org.w3c.dom.Node;

public class DOMStructure_1 {
    public static void main(String[] args) {
        // Create a DOMStructure object
        DOMStructure domStructure = new DOMStructure();

        // Get the node contained in the DOMStructure
        Node node = domStructure.getNode();

        // Print the node
        System.out.println(node);
    }
}
