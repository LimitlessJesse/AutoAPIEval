import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;

public class XMLInputFactory_1 {
    public static void main(String[] args) throws Exception {
        // Create an XMLInputFactory
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();

        // Create an input stream to read the XML file
        InputStream in = new FileInputStream("path_to_your_xml_file.xml");

        // Create an XMLStreamReader
        XMLStreamReader reader = inputFactory.createXMLStreamReader(in);

        // Use the XMLStreamReader to read the XML file
        while (reader.hasNext()) {
            int event = reader.next();
            switch (event) {
                case XMLStreamConstants.START_ELEMENT:
                    System.out.println("Start Element: " + reader.getLocalName());
                    break;
                case XMLStreamConstants.CHARACTERS:
                    System.out.println("Characters: " + reader.getText());
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    System.out.println("End Element: " + reader.getLocalName());
                    break;
            }
        }

        // Close the XMLStreamReader and the input stream
        reader.close();
        in.close();
    }
}
