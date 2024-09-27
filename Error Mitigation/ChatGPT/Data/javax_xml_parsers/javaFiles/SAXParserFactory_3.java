import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_3 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(true);
    }
}
