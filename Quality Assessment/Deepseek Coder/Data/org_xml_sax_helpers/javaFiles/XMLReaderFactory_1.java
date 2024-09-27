import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.XMLReader;

public class XMLReaderFactory_1 {
    public static void main(String[] args) {
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            System.out.println(xmlReader.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
