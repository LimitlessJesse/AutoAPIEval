import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_7 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            System.out.println(saxParser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
