import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TemplatesHandler;

public class SAXTransformerFactory_3 {
    public static void main(String[] args) {
        SAXTransformerFactory factory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        
        try {
            TemplatesHandler templatesHandler = factory.newTemplatesHandler();
            // Use the templatesHandler object to process SAX ContentHandler events
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }
}
