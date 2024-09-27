import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;

public class SAXTransformerFactory_2 {
    public static void main(String[] args) {
        SAXTransformerFactory transformerFactory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        try {
            TemplatesHandler templatesHandler = transformerFactory.newTemplatesHandler();
            System.out.println("TemplatesHandler created successfully");
        } catch (TransformerConfigurationException e) {
            System.out.println("Error creating TemplatesHandler: " + e.getMessage());
        }
    }
}
