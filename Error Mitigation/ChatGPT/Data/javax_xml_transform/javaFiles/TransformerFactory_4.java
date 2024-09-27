import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.Source;

public class TransformerFactory_4 {
    public static void main(String[] args) {
        TransformerFactory factory = TransformerFactory.newInstance();
        Source source = null; // initialize with your XML source document
        
        try {
            Source stylesheet = factory.getAssociatedStylesheet(source, "screen", "main", "UTF-8");
            // Use the stylesheet object for further processing
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }
}
