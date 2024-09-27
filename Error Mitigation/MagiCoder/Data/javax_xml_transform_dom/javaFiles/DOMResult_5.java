import javax.xml.transform.dom.DOMResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class DOMResult_5 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element rootElement = document.createElement("root");
            document.appendChild(rootElement);

            DOMResult result = new DOMResult();
            result.setNode(rootElement);
            result.setSystemId("http://www.example.com");

            System.out.println("System ID set successfully: " + result.getSystemId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
