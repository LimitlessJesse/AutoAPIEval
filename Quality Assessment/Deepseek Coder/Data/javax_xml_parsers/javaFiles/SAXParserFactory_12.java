import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_12 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        boolean isXIncludeAware = factory.isXIncludeAware();
        System.out.println("Is XInclude aware: " + isXIncludeAware);
    }
}
