import javax.xml.transform.Source;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerFactory;

public class TransformerFactory_4 {
    public static void main(String[] args) {
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Source source = new javax.xml.transform.stream.StreamSource(new java.io.File("input.xml"));
            Templates templates = factory.newTemplates(source);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }
}
