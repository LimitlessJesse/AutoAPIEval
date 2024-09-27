import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class DocumentBuilderFactory_4 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            boolean isValidating = factory.getFeature("http://xml.org/sax/features/validation");
            System.out.println("Is Validating: " + isValidating);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
