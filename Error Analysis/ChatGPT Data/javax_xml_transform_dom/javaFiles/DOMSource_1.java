import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Node;

public class DOMSource_1 {
    public static void main(String[] args) {
        // Create a DOMSource object
        DOMSource domSource = new DOMSource();
        
        // Get the Node from the DOMSource
        Node node = domSource.getNode();
        
        // Print the Node
        System.out.println("Node: " + node);
    }
}
