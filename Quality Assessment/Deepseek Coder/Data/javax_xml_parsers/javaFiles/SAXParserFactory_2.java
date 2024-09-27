import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_2 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        boolean isNamespaceAware = factory.isNamespaceAware();
        System.out.println("Is namespace aware: " + isNamespaceAware);
    }
}
