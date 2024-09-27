import org.xml.sax.ErrorHandler;
import org.xml.sax.helpers.XMLReaderAdapter;

public class XMLReaderAdapter_4 {
    public static void main(String[] args) {
        XMLReaderAdapter reader = new XMLReaderAdapter();
        ErrorHandler errorHandler = new CustomErrorHandler(); // CustomErrorHandler is a class implementing org.xml.sax.ErrorHandler
        reader.setErrorHandler(errorHandler);
    }
}
