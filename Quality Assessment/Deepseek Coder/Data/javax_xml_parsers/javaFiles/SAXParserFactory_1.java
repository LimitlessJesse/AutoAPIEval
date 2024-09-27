import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;

public class SAXParserFactory_1 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            System.out.println(factory);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
