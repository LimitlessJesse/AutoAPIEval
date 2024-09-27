import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;

public class SAXTransformerFactory_1 {
    public static void main(String[] args) {
        try {
            SAXTransformerFactory factory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
            TransformerHandler handler = factory.newTransformerHandler();
            System.out.println("TransformerHandler created successfully.");
        } catch (TransformerConfigurationException e) {
            System.out.println("Error creating TransformerHandler: " + e.getMessage());
        }
    }
}
