import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;

public class XMLOutputFactory_1 {
    public static void main(String[] args) {
        try {
            XMLOutputFactory factory = XMLOutputFactory.newInstance();
            System.out.println("XMLOutputFactory instance created successfully");
        } catch (FactoryConfigurationError e) {
            System.err.println("Error creating XMLOutputFactory instance: " + e.getMessage());
        }
    }
}
