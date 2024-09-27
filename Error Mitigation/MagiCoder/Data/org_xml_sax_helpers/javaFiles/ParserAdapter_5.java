import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.ParserAdapter;

import java.io.IOException;
import java.io.StringReader;

public class ParserAdapter_5 {
    public static void main(String[] args) {
        ParserAdapter parser = new ParserAdapter();
        String xml = "<root><element>Hello, World!</element></root>";
        try {
            parser.parse(new InputSource(new StringReader(xml)));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
