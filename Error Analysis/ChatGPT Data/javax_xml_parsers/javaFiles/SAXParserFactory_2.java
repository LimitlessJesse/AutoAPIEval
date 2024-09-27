import javax.xml.parsers.SAXParserFactory;

public class SAXParserFactory_2 {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            System.out.println("SAXParserFactory instance created successfully.");
        } catch (Exception e) {
            System.out.println("Error creating SAXParserFactory instance: " + e.getMessage());
        }
    }
}
