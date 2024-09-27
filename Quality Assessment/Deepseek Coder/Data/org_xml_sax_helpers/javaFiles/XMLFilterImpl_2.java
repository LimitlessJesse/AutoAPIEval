import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

import java.io.IOException;
import java.io.StringReader;

public class XMLFilterImpl_2 {
    public static void main(String[] args) {
        XMLFilterImpl xmlFilter = new XMLFilterImpl();
        try {
            xmlFilter.parse(new InputSource(new StringReader("<xml>Hello World</xml>")));
        } catch (IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
