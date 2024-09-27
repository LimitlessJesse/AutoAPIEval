import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Templates;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerConfigurationException;

public class TransformerFactory_2 {
    public static void main(String[] args) {
        TransformerFactory factory = TransformerFactory.newInstance();
        
        // Create a Source object (e.g. StreamSource, DOMSource, etc.)
        Source source = null; // Initialize with appropriate source
        
        try {
            Templates templates = factory.newTemplates(source);
            System.out.println("Templates object created successfully");
        } catch (TransformerConfigurationException e) {
            System.err.println("Error creating Templates object: " + e.getMessage());
        }
    }
}
