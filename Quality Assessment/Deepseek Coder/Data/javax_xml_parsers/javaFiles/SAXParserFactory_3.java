import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_3 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setNamespaceAware(true);
            System.out.println("Namespace awareness is set to: " + factory.isNamespaceAware());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
