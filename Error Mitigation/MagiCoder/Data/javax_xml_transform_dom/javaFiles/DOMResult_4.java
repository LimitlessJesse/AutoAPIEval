import javax.xml.transform.dom.DOMResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMResult_4 {
    public static void main(String[] args) {
        DOMResult result = new DOMResult();
        Document doc = result.getNode().getOwnerDocument();
        Element root = doc.createElement("root");
        doc.appendChild(root);
        System.out.println(doc.toString());
    }
}
