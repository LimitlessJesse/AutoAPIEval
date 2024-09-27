import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ext.LexicalHandler;

public class SAXResult_5 {
    public static void main(String[] args) {
        SAXResult result = new SAXResult();
        LexicalHandler lexicalHandler = result.getLexicalHandler();
        System.out.println("LexicalHandler: " + lexicalHandler);
    }
}
