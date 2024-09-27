import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.XMLReader;

public class XMLReaderFactory_2 {
    public static void main(String[] args) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
            System.out.println(reader.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
