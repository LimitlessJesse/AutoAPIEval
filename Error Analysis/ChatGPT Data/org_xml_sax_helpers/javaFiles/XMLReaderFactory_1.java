import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class XMLReaderFactory_1 {
    public static void main(String[] args) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            System.out.println("XMLReader created successfully: " + reader.getClass().getName());
        } catch (Exception e) {
            System.out.println("Error creating XMLReader: " + e.getMessage());
        }
    }
}
