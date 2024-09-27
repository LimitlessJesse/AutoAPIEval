import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ext.LexicalHandler;

public class SAXResult_2 {
    public static void main(String[] args) {
        SAXResult result = new SAXResult();
        LexicalHandler handler = new MyLexicalHandler(); // Implement your own LexicalHandler
        result.setLexicalHandler(handler);
    }
}

class MyLexicalHandler implements LexicalHandler {
    // Implement the methods of LexicalHandler interface
}
