import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

import java.io.InputStream;

public class XMLInputFactory_4 {
    public static void main(String[] args) {
        try {
            // Sample input stream (Replace with your own input stream)
            InputStream inputStream = Main.class.getResourceAsStream("example.xml");

            // Create XMLInputFactory
            XMLInputFactory factory = XMLInputFactory.newInstance();

            // Create XMLEventReader using createXMLEventReader method
            XMLEventReader eventReader = factory.createXMLEventReader(inputStream);

            // Iterate through the XML events
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                System.out.println(event);
            }

            // Close the XMLEventReader
            eventReader.close();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
