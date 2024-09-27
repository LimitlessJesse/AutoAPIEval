import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamFilter;
import javax.xml.stream.events.XMLEvent;

public class XMLInputFactory_3 {
    public static void main(String[] args) {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        StreamFilter filter = new StreamFilter() {
            @Override
            public boolean accept(XMLEvent event) {
                return event.isStartElement() && event.asStartElement().getName().getLocalPart().equals("book");
            }
        };

        try {
            XMLStreamReader reader = inputFactory.createFilteredReader(inputFactory.createXMLStreamReader(new java.io.FileInputStream("books.xml")), filter);

            while (reader.hasNext()) {
                if (reader.next() == XMLEvent.START_ELEMENT) {
                    System.out.println(reader.getName());
                }
            }
        } catch (XMLStreamException | java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
