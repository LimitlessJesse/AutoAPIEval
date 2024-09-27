import javax.xml.transform.dom.DOMResult;
import org.w3c.dom.Node;

public class DOMResult_2 {
    public static void main(String[] args) {
        DOMResult domResult = new DOMResult();
        Node node = domResult.getNode();
        System.out.println("Initial node: " + node);

        // Setting a new node
        Node newNode = domResult.createNode();
        domResult.setNode(newNode);
        System.out.println("Updated node: " + domResult.getNode());
    }
}
