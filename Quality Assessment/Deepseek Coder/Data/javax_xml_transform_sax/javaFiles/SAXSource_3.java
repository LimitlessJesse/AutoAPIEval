import javax.xml.transform.sax.SAXSource;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import java.io.StringReader;

public class SAXSource_3 {
    public static void main(String[] args) throws Exception {
        // Create a SAXParserFactory
        SAXParserFactory factory = SAXParserFactory.newInstance();

        // Get the XMLReader from the factory
        XMLReader reader = factory.newSAXParser().getXMLReader();

        // Create an InputSource from a string
        InputSource inputSource = new InputSource(new StringReader("<xml>Hello, World</xml>"));

        // Create a SAXSource from the XMLReader and InputSource
        SAXSource source = new SAXSource(reader, inputSource);

        // Print the XMLReader from the SAXSource
        System.out.println(source.getXMLReader());
    }
}
