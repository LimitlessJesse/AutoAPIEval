import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;

public class SAXParserFactory_1 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            System.out.println("SAXParserFactory instance created successfully.");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
