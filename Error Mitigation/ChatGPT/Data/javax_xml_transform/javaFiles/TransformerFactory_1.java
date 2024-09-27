import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;

public class TransformerFactory_1 {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            System.out.println("Transformer object created successfully: " + transformer);
        } catch (TransformerConfigurationException e) {
            System.out.println("Error creating Transformer object: " + e.getMessage());
        }
    }
}
