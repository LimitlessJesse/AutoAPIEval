import org.xml.sax.helpers.ParserAdapter;
import org.xml.sax.DTDHandler;

public class ParserAdapter_2 {
    public static void main(String[] args) {
        ParserAdapter parserAdapter = new ParserAdapter();
        parserAdapter.setDTDHandler(new DTDHandler() {
            @Override
            public void notationDecl(String name, String publicId, String systemId) {
                // Implement the logic here
            }

            @Override
            public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) {
                // Implement the logic here
            }
        });
    }
}
