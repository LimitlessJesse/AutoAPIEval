import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class XMLReaderFactory_1 {
    public static void main(String[] args) {
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            System.out.println("XMLReader created successfully: " + xmlReader.getClass().getName());
        } catch (SAXException e) {
            System.out.println("Error creating XMLReader: " + e.getMessage());
        }
    }
}
