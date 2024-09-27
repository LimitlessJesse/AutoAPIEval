import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DocumentBuilderFactory_2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            System.out.println("Feature set successfully");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
