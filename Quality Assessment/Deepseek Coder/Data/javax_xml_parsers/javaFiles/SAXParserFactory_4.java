import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_4 {
    public static void main(String[] args) {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        boolean isValidating = factory.isValidating();
        System.out.println("Is Validating: " + isValidating);
    }
}
