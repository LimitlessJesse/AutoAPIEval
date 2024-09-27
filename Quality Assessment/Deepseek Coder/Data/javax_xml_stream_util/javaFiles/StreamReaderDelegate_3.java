import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_3 {
    public static void main(String[] args) {
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            StreamReaderDelegate streamReader = inputFactory.createFilteredReader(inputFactory.createXMLStreamReader("<root>Hello World</root>"));

            int nextCharacter;
            while ((nextCharacter = streamReader.next())!= XMLStreamConstants.END_ELEMENT) {
                System.out.print((char) nextCharacter);
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
