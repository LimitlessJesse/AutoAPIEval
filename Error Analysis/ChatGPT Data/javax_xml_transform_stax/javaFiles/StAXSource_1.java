import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stax.StAXSource;

public class StAXSource_1 {
    public static void main(String[] args) {
        // Create an XMLInputFactory
        XMLInputFactory factory = XMLInputFactory.newInstance();
        
        // Create an XMLStreamReader
        XMLStreamReader reader = null;
        try {
            reader = factory.createXMLStreamReader(new StAXSource());
            
            // Use the XMLStreamReader in your code
            while (reader.hasNext()) {
                reader.next();
                // Handle XML events
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
