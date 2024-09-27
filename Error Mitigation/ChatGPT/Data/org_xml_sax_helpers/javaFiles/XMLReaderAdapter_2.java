import org.xml.sax.DTDHandler;
import org.xml.sax.helpers.XMLReaderAdapter;

public class XMLReaderAdapter_2 {
    public static void main(String[] args) {
        XMLReaderAdapter readerAdapter = new XMLReaderAdapter();
        DTDHandler handler = new CustomDTDHandler(); // CustomDTDHandler is a custom implementation of DTDHandler
        readerAdapter.setDTDHandler(handler);
    }
}
