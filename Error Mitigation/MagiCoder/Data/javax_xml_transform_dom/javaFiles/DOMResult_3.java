import javax.xml.transform.dom.DOMResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.DocumentFragment;

public class DOMResult_3 {
    public static void main(String[] args) {
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("root");
        doc.appendChild(root);

        DOMResult result = new DOMResult();
        result.setNode(root);

        // Now you can use result.getNode() to get the root element.
    }
}
