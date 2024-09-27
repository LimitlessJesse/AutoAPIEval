import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

public class SAXParserFactory_4 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            boolean isValid = factory.getFeature("http://xml.org/sax/features/validation");
            System.out.println("Validation feature is " + (isValid? "supported" : "not supported"));
        } catch (ParserConfigurationException | SAXNotRecognizedException | SAXNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
