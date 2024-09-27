import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import java.io.StringReader;

public class DocumentBuilder_2 {
    public static void main(String[] args) {
        try {
            String xml = "<root>Hello World</root>";
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xml));
            Document doc = builder.parse(is);

            System.out.println(doc.getDocumentElement().getTextContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
