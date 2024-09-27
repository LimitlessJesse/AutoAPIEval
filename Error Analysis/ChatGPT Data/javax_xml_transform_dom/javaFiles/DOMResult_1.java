import javax.xml.transform.dom.DOMResult;
import org.w3c.dom.Node;

public class DOMResult_1 {
    public static void main(String[] args) {
        DOMResult domResult = new DOMResult();
        Node node = domResult.getNode();
        System.out.println("Node: " + node);
    }
}
