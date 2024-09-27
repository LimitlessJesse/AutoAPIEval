import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_5 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setValidating(false);
    }
}
