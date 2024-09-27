import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.DTDHandler;

public class ParserAdapter_4 {
    public static void main(String[] args) {
        ParserAdapter parserAdapter = new ParserAdapter();
        parserAdapter.setDTDHandler(new DTDHandler() {
            @Override
            public void notationDecl(String name, String publicId, String systemId) {
                // handle notation declaration
            }

            @Override
            public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) {
                // handle unparsed entity declaration
            }
        });
    }
}
