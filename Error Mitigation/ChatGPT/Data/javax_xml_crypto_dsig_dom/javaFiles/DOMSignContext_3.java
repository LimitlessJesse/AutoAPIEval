import javax.xml.crypto.dsig.dom.DOMSignContext;
import org.w3c.dom.Node;

public class DOMSignContext_3 {
    public static void main(String[] args) {
        DOMSignContext context = new DOMSignContext(null, null);
        Node nextSibling = context.getNextSibling();
        context.setNextSibling(nextSibling);
    }
}
