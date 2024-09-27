import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMSource_7 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            Node node = doc.createElement("root");
            doc.appendChild(node);
            DOMSource source = new DOMSource(doc);
            Node nodeFromSource = source.getNode();
            System.out.println(nodeFromSource.getNodeName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
