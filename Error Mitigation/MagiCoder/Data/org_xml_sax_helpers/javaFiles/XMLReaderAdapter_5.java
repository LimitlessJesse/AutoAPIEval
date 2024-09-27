import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderAdapter;

import java.io.IOException;

public class XMLReaderAdapter_5 {
    public static void main(String[] args) {
        XMLReaderAdapter xmlReaderAdapter = new XMLReaderAdapter();
        try {
            xmlReaderAdapter.parse(new InputSource("http://www.example.com"));
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
