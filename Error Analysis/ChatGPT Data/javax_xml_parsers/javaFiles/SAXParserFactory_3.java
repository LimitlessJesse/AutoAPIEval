import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_3 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://xml.org/sax/features/validation", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
