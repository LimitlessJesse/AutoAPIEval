import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_19 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
