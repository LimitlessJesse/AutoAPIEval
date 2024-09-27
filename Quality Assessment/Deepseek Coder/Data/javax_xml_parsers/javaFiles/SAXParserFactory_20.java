import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_20 {
    public static void main(String[] args) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setFeature("http://xml.org/sax/features/validation", true);
        boolean isValidating = factory.getFeature("http://xml.org/sax/features/validation");
        System.out.println("Validation is " + (isValidating? "enabled" : "disabled"));
    }
}
