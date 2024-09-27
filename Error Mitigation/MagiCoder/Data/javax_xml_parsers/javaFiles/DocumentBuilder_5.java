import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DocumentBuilder_5 {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputStream is = new FileInputStream("path_to_your_xml_file.xml");
            Document doc = builder.parse(is);
            // Now you can use the Document object as you need
        } catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }
}
