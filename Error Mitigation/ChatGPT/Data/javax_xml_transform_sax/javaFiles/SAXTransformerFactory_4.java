import javax.xml.transform.Source;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import org.xml.sax.XMLFilter;

public class SAXTransformerFactory_4 {
    public static void main(String[] args) {
        SAXTransformerFactory factory = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
        
        try {
            Source src = null; // Provide the transformation instructions source
            XMLFilter xmlFilter = factory.newXMLFilter(src);
            if(xmlFilter != null) {
                System.out.println("XMLFilter created successfully");
            } else {
                System.out.println("XMLFilter creation not supported");
            }
        } catch (TransformerConfigurationException e) {
            System.out.println("Error creating XMLFilter: " + e.getMessage());
        }
    }
}
