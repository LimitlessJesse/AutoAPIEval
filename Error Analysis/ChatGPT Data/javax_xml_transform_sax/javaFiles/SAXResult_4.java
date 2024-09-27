import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ext.LexicalHandler;

public class SAXResult_4 {
    public static void main(String[] args) {
        SAXResult saxResult = new SAXResult();
        LexicalHandler lexicalHandler = saxResult.getLexicalHandler();
        // Now you can use the lexicalHandler object for further operations
    }
}
