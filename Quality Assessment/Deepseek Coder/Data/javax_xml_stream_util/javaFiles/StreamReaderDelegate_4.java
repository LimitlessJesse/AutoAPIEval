import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.util.StreamReaderDelegate;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class StreamReaderDelegate_4 {
    public static void main(String[] args) {
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            StreamReaderDelegate streamReaderDelegate = new StreamReaderDelegate(inputFactory.createXMLStreamReader(new FileInputStream("path_to_your_xml_file")));

            int event = streamReaderDelegate.nextTag();

            while (event!= XMLStreamConstants.END_DOCUMENT) {
                if (event == XMLStreamConstants.START_ELEMENT) {
                    System.out.println("Start element: " + streamReaderDelegate.getLocalName());
                } else if (event == XMLStreamConstants.END_ELEMENT) {
                    System.out.println("End element: " + streamReaderDelegate.getLocalName());
                }
                event = streamReaderDelegate.nextTag();
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
