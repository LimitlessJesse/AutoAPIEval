import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_1 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            System.out.println("SAXParser newSAXParser() method used successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
