import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
import java.io.File;

public class SAXParser_2 {
    public static void main(String[] args) {
        try {
            File file = new File("example.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler();

            saxParser.parse(file, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
