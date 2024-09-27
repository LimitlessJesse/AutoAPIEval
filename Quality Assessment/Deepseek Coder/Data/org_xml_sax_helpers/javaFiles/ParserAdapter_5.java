import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.ParserAdapter;

public class ParserAdapter_5 {
    public static void main(String[] args) {
        ParserAdapter parserAdapter = new ParserAdapter();
        parserAdapter.setErrorHandler(new ErrorHandler() {
            @Override
            public void warning(SAXParseException exception) {
                System.out.println("Warning: " + exception.getMessage());
            }

            @Override
            public void error(SAXParseException exception) {
                System.out.println("Error: " + exception.getMessage());
            }

            @Override
            public void fatalError(SAXParseException exception) {
                System.out.println("Fatal Error: " + exception.getMessage());
            }
        });
    }
}
