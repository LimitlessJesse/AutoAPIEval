import javax.xml.crypto.dom.DOMStructure;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

public class DOMStructure_2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            DOMStructure domStructure = new DOMStructure(doc);
            Node node = domStructure.getNode();
            System.out.println(node.getNodeName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
