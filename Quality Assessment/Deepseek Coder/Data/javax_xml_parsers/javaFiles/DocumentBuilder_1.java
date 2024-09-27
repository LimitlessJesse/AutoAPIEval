import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class DocumentBuilder_1 {
    public static void main(String[] args) {
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse an XML file into a Document
            InputStream in = new FileInputStream("example.xml");
            Reader reader = new InputStreamReader(in);
            InputSource inputSource = new InputSource(reader);
            Document doc = builder.parse(inputSource);

            // Normalize the document
            doc.getDocumentElement().normalize();

            // Get the root element
            Element root = doc.getDocumentElement();

            // Get all elements
            NodeList nodeList = doc.getElementsByTagName("*");

            // Print the root element
            System.out.println("Root element: " + root.getNodeName());

            // Print all elements
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("Element: " + node.getNodeName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
