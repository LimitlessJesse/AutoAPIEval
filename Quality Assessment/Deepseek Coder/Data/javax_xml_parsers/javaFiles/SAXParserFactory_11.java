import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_11 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setXIncludeAware(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
