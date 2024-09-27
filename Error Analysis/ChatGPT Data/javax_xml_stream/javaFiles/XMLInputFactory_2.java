import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;

public class XMLInputFactory_2 {
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            InputStream inputStream = new FileInputStream("example.xml");
            XMLStreamReader reader = factory.createXMLStreamReader(inputStream);
            
            while (reader.hasNext()) {
                int event = reader.next();
                if (event == XMLStreamReader.START_ELEMENT) {
                    System.out.println("Start Element: " + reader.getLocalName());
                } else if (event == XMLStreamReader.CHARACTERS) {
                    System.out.println("Text: " + reader.getText());
                } else if (event == XMLStreamReader.END_ELEMENT) {
                    System.out.println("End Element: " + reader.getLocalName());
                }
            }
            
            reader.close();
        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
