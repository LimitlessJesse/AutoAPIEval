import javax.xml.transform.stax.StAXSource;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

public class StAXSource_3 {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(System.in);
            StAXSource staxSource = new StAXSource(reader);
            XMLEventReader eventReader = staxSource.getXMLEventReader();
            
            while(eventReader.hasNext()) {
                System.out.println(eventReader.nextEvent());
            }
            
            eventReader.close();
            reader.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
