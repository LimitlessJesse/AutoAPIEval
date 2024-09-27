import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.FactoryConfigurationError;

public class XMLEventFactory_1 {
    public static void main(String[] args) {
        try {
            XMLEventFactory factory = XMLEventFactory.newInstance();
            System.out.println("XMLEventFactory instance created successfully.");
        } catch (FactoryConfigurationError e) {
            System.out.println("Error creating XMLEventFactory instance: " + e.getMessage());
        }
    }
}
