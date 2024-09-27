import javax.xml.crypto.dom.DOMStructure;
import org.w3c.dom.Node;

public class DOMStructure_1 {
    public static void main(String[] args) {
        DOMStructure domStructure = new DOMStructure();
        Node node = domStructure.getNode();
        System.out.println("Node: " + node);
    }
}
