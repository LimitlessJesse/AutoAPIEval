import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

public class XMLInputFactory_1 {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            System.out.println("XMLInputFactory instance created successfully.");
        } catch (XMLStreamException e) {
            System.out.println("An error occurred while creating XMLInputFactory instance: " + e.getMessage());
        }
    }
}
