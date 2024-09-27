import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParser_4 {
    public static void main(String[] args) {
        try {
            String uri = "sample.xml"; // example XML file path
            DefaultHandler dh = new DefaultHandler(); // example DefaultHandler implementation

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            saxParser.parse(uri, dh);

            System.out.println("Parsing complete.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
